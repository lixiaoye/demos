package design_pattern.creational.abstractfactory.demo3;

/**
 * Created by LIXIAOYE on 2018/11/7.
 */

public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
