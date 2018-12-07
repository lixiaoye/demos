package design_pattern.behavioral.iterator.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 */

public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List getObjects() {
        return this.objects;
    }
    //声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();
}
