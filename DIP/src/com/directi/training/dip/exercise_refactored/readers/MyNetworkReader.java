package com.directi.training.dip.exercise_refactored.readers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyNetworkReader implements IReader
{
    private String protocol;
    private String host;
    private String file;

    public MyNetworkReader(String protocol, String host, String file)
    {
        this.protocol = protocol;
        this.host = host;
        this.file = file;
    }

    @Override
    public String read() throws IOException
    {
        URL url = new URL(protocol, host, file);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int input;
        input = reader.read();
        while (input != -1) {
            inputString.append((char) input);
            input = reader.read();
        }
        return inputString.toString();
    }
}
