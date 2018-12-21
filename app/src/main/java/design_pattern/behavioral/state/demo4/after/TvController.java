package design_pattern.behavioral.state.demo4.after;

/**
 * 电视遥控器，类似于经典状态模式中的Context
 */

public class TvController implements PowerController {
    TvState mTvState;

    public void setTvState(TvState tvState) {
        this.mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void preChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
