package design_pattern.behavioral.iterator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器类
 */

public class ConcreteAggregate<T> implements Aggregate<T>{
    private List<T> list=new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
    list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
