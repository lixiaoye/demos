package design_pattern.structural_pattern.composite.demo1.before;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public abstract class Component {
protected String name;//节点名
    public Component(String name){
        this.name=name;
    }
    public abstract void doSomething();
}
