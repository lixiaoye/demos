package design_pattern.behavioral.command.demo4;

/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
