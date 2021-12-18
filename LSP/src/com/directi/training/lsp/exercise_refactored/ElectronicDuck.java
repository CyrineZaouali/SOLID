package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IDuck
{
    private boolean isOn = false;

    @Override
    public void quack() throws DuckIsOffException
    {
        if (isOn) {
            System.out.println("Electronic duck quacks...");
        } else {
            throw new DuckIsOffException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckIsOffException
    {
        if (isOn) {
            System.out.println("Electronic duck swims...");
        } else {
            throw new DuckIsOffException("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this.isOn = true;
    }

    public void turnOff()
    {
        this.isOn = false;
    }


    public static class DuckIsOffException extends IDuckException
    {
        public DuckIsOffException(String message)
        {
            super(message);
        }
    }

}
