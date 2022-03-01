package com.directi.training.dip.exercise_refactored;

import com.directi.training.dip.exercise_refactored.readers.IReader;
import com.directi.training.dip.exercise_refactored.readers.MyFileReader;
import com.directi.training.dip.exercise_refactored.readers.MyNetworkReader;
import com.directi.training.dip.exercise_refactored.writers.IWriter;
import com.directi.training.dip.exercise_refactored.writers.MyDatabaseWriter;
import com.directi.training.dip.exercise_refactored.writers.MyFileWriter;

import java.io.IOException;

public class EncodingModuleClient
{
    private static final String readerUrl = "DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt";
    private static final String writerUrl = "DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt";
    private static final String PROTOCOL = "http";
    private static final String HOST = "myfirstappwith.appspot.com";
    private static final String FILE = "/index.html";

    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader(readerUrl);
        IWriter writer = new MyFileWriter(writerUrl);
        encodingModule.encode(reader, writer);

        reader = new MyNetworkReader(PROTOCOL, HOST, FILE);
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}
