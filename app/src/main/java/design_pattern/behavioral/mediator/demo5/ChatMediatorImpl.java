package design_pattern.behavioral.mediator.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it.
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
