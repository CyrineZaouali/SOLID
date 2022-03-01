package com.directi.training.dip.exercise_refactored.writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter
{
    private String fileName;

    public MyFileWriter(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void write(String encodedLine) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(encodedLine);
        writer.close();
    }
}
