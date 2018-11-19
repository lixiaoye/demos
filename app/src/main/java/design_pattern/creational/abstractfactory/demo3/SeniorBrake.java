package design_pattern.creational.abstractfactory.demo3;

/**
 * Created by LIXIAOYE on 2018/11/7.
 */

public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
