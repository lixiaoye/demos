package design_pattern.creational.abstractfactory.demo2;

/**
 * Created by LIXIAOYE on 2018/11/7.
 */

/**
 * 具体工厂类2
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
