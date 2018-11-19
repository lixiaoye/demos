package design_pattern.creational.prototype.demo1;

/**
 * Created by LIXIAOYE on 2018/11/13.
 */

public abstract class Prototype {
    private String id;//属性

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Prototype clone();//抽象类关键就是有这样一个clone方法；

}
