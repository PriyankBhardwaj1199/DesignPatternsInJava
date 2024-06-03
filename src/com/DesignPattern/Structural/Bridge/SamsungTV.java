package com.DesignPattern.Structural.Bridge;

public class SamsungTV implements TV{

    @Override
    public void on() {
        System.out.println("Samsung TV is on");
    }

    @Override
    public void off() {
        System.out.println("Samsung TV is off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Samsung TV tuned to channel " + channel);
    }
}
