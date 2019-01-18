package design_pattern.structural_pattern.bridge.demo3;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + impl + "咖啡");
    }
}
