package data_structure.factorymethod.demo1.multiFactory;

import data_structure.factorymethod.demo1.Factory;
import data_structure.factorymethod.demo1.Product;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.method();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.method();
    }
}
