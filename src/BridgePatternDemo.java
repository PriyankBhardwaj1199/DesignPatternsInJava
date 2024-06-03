import com.DesignPattern.Structural.Bridge.*;

public class BridgePatternDemo {

    public static void main(String[] args) {
        TV sonyTV = new SonyTV();
        TV samsungTV = new SamsungTV();

        RemoteControl remoteControl = new RemoteControl(sonyTV) {};
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(samsungTV);

        // Using the basic remote control with a Sony TV
        remoteControl.turnOn();
        remoteControl.setChannel(5);
        remoteControl.turnOff();

        // Using the advanced remote control with a Samsung TV
        advancedRemoteControl.turnOn();
        advancedRemoteControl.setChannel(10);
        advancedRemoteControl.mute();
        advancedRemoteControl.turnOff();
    }
}
