package design_pattern.behavioral.state.demo3;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
