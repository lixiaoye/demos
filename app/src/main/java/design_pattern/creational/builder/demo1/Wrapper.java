package design_pattern.creational.builder.demo1;


//包装纸
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}
