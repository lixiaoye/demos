package design_pattern.behavioral.mediator.demo5;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
