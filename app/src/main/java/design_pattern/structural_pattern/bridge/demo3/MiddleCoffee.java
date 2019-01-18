package design_pattern.structural_pattern.bridge.demo3;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class MiddleCoffee extends Coffee{
    public MiddleCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("中杯"+impl+"咖啡");
    }
}
