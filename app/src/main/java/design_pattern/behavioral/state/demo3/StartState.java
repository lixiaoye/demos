package design_pattern.behavioral.state.demo3;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
