package design_pattern.behavioral.command.demo4;

/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
