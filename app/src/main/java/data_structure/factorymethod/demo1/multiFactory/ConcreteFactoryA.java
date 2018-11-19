package data_structure.factorymethod.demo1.multiFactory;

import data_structure.factorymethod.demo1.ConcreteProductA;
import data_structure.factorymethod.demo1.Factory;
import data_structure.factorymethod.demo1.Product;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public class ConcreteFactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
