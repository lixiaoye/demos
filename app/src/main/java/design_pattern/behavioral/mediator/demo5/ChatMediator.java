package design_pattern.behavioral.mediator.demo5;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public interface ChatMediator {
    public void sendMessage(String smg,User user);
    void addUser(User user);
}
