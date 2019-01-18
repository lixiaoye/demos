package design_pattern.structural_pattern.adapter.demo;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */
//塑料玩具鸭
public class PlasticToyDuck implements ToyDuck{
    @Override
    public void squeak() {//吱吱叫
        System.out.println("Squeak");
    }
}
