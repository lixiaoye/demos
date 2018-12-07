package design_pattern.behavioral.mediator.demo3;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public class MobileColleague extends Colleague {
    public MobileColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mobile Received:" + message);
    }
}
