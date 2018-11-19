package design_pattern.behavioral.observer.demo2;

/**
 * 具体主题：ConcreteSubject
 */

public class ConcreteSubject extends Subject {
    //实现通知方法
    @Override
    public void notify2() {
        //遍历观察者集合，调用每一个观察者的响应方法
        for (Observer obs : observers) {
            ((Observer) obs).update();
        }
    }
}
