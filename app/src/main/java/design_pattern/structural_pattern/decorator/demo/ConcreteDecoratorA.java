package design_pattern.structural_pattern.decorator.demo;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class ConcreteDecoratorA extends Decorator{
    protected ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        //装饰方法A和B既可在父类方法前调用也可在之后调用
        operateA();
        super.operate();
        operateB();
    }
    //自定义装饰方法B
    private void operateB() {

    }

    //自定义装饰方法A
    private void operateA() {
    }
}
