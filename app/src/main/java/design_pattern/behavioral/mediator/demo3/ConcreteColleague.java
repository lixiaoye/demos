package design_pattern.behavioral.mediator.demo3;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague Received:" + message);
    }
}
