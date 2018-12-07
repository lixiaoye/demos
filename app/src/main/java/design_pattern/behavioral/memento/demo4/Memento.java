package design_pattern.behavioral.memento.demo4;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
