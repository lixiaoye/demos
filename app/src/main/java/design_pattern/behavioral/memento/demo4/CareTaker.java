package design_pattern.behavioral.memento.demo4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
