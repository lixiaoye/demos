package design_pattern.creational.builder.demo1;

//汉堡实现类-鸡肉汉堡
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 59.5f;
    }
}
