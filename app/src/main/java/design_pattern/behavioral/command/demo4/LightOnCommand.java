package design_pattern.behavioral.command.demo4;

/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public class LightOnCommand implements Command {
    Light light;

    //the constructor is passed the light it is going to control
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
