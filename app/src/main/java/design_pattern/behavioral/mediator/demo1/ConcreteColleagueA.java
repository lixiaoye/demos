package design_pattern.behavioral.mediator.demo1;

/**
 * 具体同事A
 */

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA 将信息递交给中介者处理");
    }
}
