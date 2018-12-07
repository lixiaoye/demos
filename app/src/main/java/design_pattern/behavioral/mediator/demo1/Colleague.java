package design_pattern.behavioral.mediator.demo1;

/**
 * 抽象同事
 */

public abstract class Colleague {
    protected Mediator mediator;//中介者对象

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 同事角色的具体行为，由子类去实现
     */
    public abstract void action();
}
