package design_pattern.behavioral.mediator.demo2;


/**
 * 具体中介者类
 * 在具体中介者类中将调用同事类的方法，调用时可以增加一些自己的业务代码对调用进行控制
 *
 */

public class ConcreteMediator extends Mediator{
    //实现业务方法，封装同事之间的调用
    @Override
    public void operation() {
        //...
        ((Colleague)colleagues.get(0)).method1();//通过中介者调用同事类的方法
        //...

    }
}
