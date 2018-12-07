package design_pattern.behavioral.mediator.demo3;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public class Client {
    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        MobileColleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");
    }
}
