package design_pattern.behavioral.mediator.demo2;

import java.util.ArrayList;

/**
 * 抽象中介者类
 * 在抽象中介者中定义一个同事类的集合，用于存储同事对象并提供注册方法，
 * 同时声明了具体中介者类所具有的方法。
 */

public abstract class Mediator {
    protected ArrayList<Colleague> colleagues;//用于存储同事对象

    //注册方法，用于增加同事对象
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    //声明抽象的业务方法
    public abstract void operation();
}
