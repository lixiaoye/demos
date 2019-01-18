package design_pattern.structural_pattern.bridge.demo3;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class Client {
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();//原味
        Sugar sugar = new Sugar();//糖
        //大杯 原味
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();

        //小杯 原味
        SmallCoffee smallCoffee = new SmallCoffee(ordinary);
        smallCoffee.makeCoffee();
        //大杯 加糖
        LargeCoffee largeCoffee1 = new LargeCoffee(sugar);
        largeCoffee1.makeCoffee();
        //小杯加糖
        SmallCoffee smallCoffee1 = new SmallCoffee(sugar);
        smallCoffee1.makeCoffee();
    }
}
