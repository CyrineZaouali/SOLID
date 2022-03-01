package com.directi.training.dip.exercise_refactored.writers;

import java.io.IOException;

public interface IWriter
{
    void write(String encodedLine) throws IOException;
}
