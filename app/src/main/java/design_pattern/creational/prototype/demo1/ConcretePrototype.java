package design_pattern.creational.prototype.demo1;

/**
 * Created by LIXIAOYE on 2018/11/13.
 */

public class ConcretePrototype extends Prototype {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Prototype clone() {
//        Prototype design_pattern.creational.prototype = new ConcretePrototype();//创建新对象
//        design_pattern.creational.prototype.setId(this.id);
//        return design_pattern.creational.prototype;
        return this;
    }
}
