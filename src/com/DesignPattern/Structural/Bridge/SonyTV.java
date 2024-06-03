package com.DesignPattern.Structural.Bridge;

public class SonyTV implements TV{

    @Override
    public void on() {
        System.out.println("Sony TV is on");
    }

    @Override
    public void off() {
        System.out.println("Sony TV is off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Sony TV tuned to channel " + channel);
    }
}
