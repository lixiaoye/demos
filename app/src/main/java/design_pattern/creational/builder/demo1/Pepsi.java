package design_pattern.creational.builder.demo1;

//冷饮实现类-百事可乐
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
