package com.DesignPattern.Structural.Bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(TV tv) {
        super(tv);
    }

    public void mute() {
        System.out.println("TV is muted");
    }
}
