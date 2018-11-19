package data_structure.factorymethod.demo1;

/**
 * Created by LIXIAOYE on 2018/11/8.
 */

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct();
        p.method();
    }
}
