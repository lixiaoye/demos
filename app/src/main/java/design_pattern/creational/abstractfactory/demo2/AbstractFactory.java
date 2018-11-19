package design_pattern.creational.abstractfactory.demo2;

/**
 * Created by LIXIAOYE on 2018/11/7.
 */

public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     * @return 产品A对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的方法
     * @return 产品B对象
     */
    public abstract AbstractProductB createProductB();

}
