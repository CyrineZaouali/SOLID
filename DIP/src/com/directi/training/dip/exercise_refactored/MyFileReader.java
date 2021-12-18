package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements IReader {
    private String fileName;

    public MyFileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() throws IOException {
        StringBuilder text = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            text.append(line);
        }
        reader.close();
        return text.toString();
    }
}
