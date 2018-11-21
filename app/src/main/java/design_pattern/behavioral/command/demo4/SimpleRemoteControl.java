package design_pattern.behavioral.command.demo4;

/**
 * A simple remote control with the button
 */

public class SimpleRemoteControl {
    Command slot;//only one button

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        //set the command the remote will execute
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
