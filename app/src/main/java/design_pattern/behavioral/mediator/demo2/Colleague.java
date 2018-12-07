package design_pattern.behavioral.mediator.demo2;


/**
 * 在具体中介者类中将调用同事类的方法，调用时可以增加一些自己的业务代码对调用进行控制。
 在抽象同事类中维持了一个抽象中介者的引用，用于调用中介者的方法
 */

public abstract class Colleague {
    protected Mediator mediator;//维持一个抽象中介者的引用

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void method1();//声明自身方法，处理自己的行为

    //定义依赖方法，与中介者进行通信
    public void method2() {
        mediator.operation();
    }
}
