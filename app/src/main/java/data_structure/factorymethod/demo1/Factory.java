package data_structure.factorymethod.demo1;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public abstract class Factory {
    /**
     * 抽象工厂方法，具体生产什么由子类去实现
     * @return 具体的产品对象
     */
    public abstract Product createProduct();
}
