package data_structure.factorymethod.demo1.optimization;

import data_structure.factorymethod.demo1.Product;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public abstract class Factory {
    /**
     * 抽象工厂方法，具体生产什么由子类去实现
     *
     * @param clz 产品对象类类型
     * @param <T> 具体的产品对象
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
