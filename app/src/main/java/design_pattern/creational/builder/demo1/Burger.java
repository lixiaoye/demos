package design_pattern.creational.builder.demo1;

//抽象汉堡类
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
