package com.DesignPattern.Structural.Bridge;

public abstract class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.on();
    }

    public void turnOff() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }
}
