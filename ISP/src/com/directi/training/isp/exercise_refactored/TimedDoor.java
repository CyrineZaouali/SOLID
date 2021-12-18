package com.directi.training.isp.exercise_refactored;

public class TimedDoor implements Door, TimerClient
{
    private static final int TIMEOUT = 100;
    private boolean isLocked;
    private boolean isOpen;

    public TimedDoor(Timer timer)
    {
        timer.register(TIMEOUT, this);
    }

    @Override
    public void lock()
    {
        isLocked = true;
    }

    @Override
    public void unlock()
    {
        isLocked = false;
    }

    @Override
    public void open()
    {
        if (!isLocked) {
            isOpen = true;
        }
    }

    @Override
    public void close()
    {
        isOpen = false;
    }

    @Override
    public void timeOutCallback()
    {
        isLocked = true;
    }
}
