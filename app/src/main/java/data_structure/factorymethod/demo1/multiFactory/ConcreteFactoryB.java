package data_structure.factorymethod.demo1.multiFactory;

import data_structure.factorymethod.demo1.ConcreteProductB;
import data_structure.factorymethod.demo1.Factory;
import data_structure.factorymethod.demo1.Product;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
