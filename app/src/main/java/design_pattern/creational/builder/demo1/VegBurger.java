package design_pattern.creational.builder.demo1;

//汉堡实现类-蔬菜汉堡
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
