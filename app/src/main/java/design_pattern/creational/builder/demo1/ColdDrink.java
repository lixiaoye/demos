package design_pattern.creational.builder.demo1;

//抽象冷饮类
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
