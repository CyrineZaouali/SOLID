package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase
{
    private static Map<Integer, String> _data = new HashMap<>();
    private static int count = 0;

    public int write(String inputString)
    {
        _data.put(++count, inputString);
        return count;
    }
}
