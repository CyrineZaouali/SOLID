package com.directi.training.isp.exercise_refactored;

public class SensingDoor implements Door, SensorClient
{
    private boolean isLocked;
    private boolean isOpen;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void lock()
    {
        this.isLocked = true;
    }

    @Override
    public void unlock()
    {
        this.isLocked = false;
    }

    @Override
    public void open()
    {
        if (!this.isLocked) {
            this.isOpen = true;
        }
    }

    @Override
    public void close()
    {
        this.isOpen = false;
    }

    @Override
    public void proximityCallback()
    {
        this.isOpen = true;
    }
}
