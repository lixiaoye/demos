package design_pattern.structural_pattern.adapter.demo;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */
//麻雀
public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");//鸟叫，虫鸣;
    }
}
