package design_pattern.creational.abstractfactory.demo3;

/**
 * Created by LIXIAOYE on 2018/11/7.
 */

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
