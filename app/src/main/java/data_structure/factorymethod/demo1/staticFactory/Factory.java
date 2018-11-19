package data_structure.factorymethod.demo1.staticFactory;

import data_structure.factorymethod.demo1.ConcreteProductA;
import data_structure.factorymethod.demo1.Product;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public class Factory {
    public static Product createProduct(){
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
