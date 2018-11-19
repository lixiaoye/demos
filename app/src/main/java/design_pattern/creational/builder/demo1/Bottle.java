package design_pattern.creational.builder.demo1;

/**
 * Created by LIXIAOYE on 2018/11/14.
 */
//瓶子
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
