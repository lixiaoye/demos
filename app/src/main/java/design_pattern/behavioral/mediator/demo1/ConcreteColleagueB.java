package design_pattern.behavioral.mediator.demo1;


/**
 * 具体同事B
 */

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueB 将信息递交给中介者处理");
    }
}
