package data_structure.factorymethod.demo1;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
//        return new ConcreteProductA();
        return new ConcreteProductB();
    }
}
