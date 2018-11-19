package design_pattern.creational.prototype.demo1;


/**
 * Created by LIXIAOYE on 2018/11/13.
 */

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype();
        prototype1.setId("I");
        ConcretePrototype prototype11 = (ConcretePrototype) prototype1.clone();
        System.out.println("cloned obj:" + prototype11.getId());//cloned obj:I
    }
}
