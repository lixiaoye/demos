package design_pattern.creational.abstractfactory.demo3;


/**
 * Created by LIXIAOYE on 2018/11/7.
 */

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
