package design_pattern.behavioral.command.demo4;

/**
 * Driver class.
 */

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();//请求接收者
        Stereo stereo = new Stereo();//命令类

        //we can change command dynamically
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new StereoOnWithCDCommand(stereo));
        remote.buttonWasPressed();

    }
}
