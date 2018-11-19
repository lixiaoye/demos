package design_pattern.creational.builder.demo1;

//冷饮实现类-可乐
public class Coke  extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
