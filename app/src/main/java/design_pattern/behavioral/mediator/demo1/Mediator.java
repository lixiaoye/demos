package design_pattern.behavioral.mediator.demo1;

/**
 * 抽象中介者
 */

public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;//具体同事类A
    protected ConcreteColleagueB colleagueB;//具体同事类B

    /**
     * 抽象中介方法、子类实现
     */
    public abstract void method();

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
