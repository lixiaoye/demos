package design_pattern.creational.abstractfactory.demo2;

/**
 * Created by LIXIAOYE on 2018/11/7.
 */

/**
 * 具体工厂类1
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
