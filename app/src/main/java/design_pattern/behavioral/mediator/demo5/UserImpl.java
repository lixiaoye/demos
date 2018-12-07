package design_pattern.behavioral.mediator.demo5;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ":Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ":Received Message:" + msg);
    }
}
