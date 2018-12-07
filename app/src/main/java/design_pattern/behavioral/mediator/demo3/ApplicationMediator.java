package design_pattern.behavioral.mediator.demo3;

import java.util.ArrayList;

/**
 * Created by LIXIAOYE on 2018/11/27.
 */

public class ApplicationMediator implements Mediator {
    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        //let all other screens know that this screen has changed
        for (Colleague c : colleagues) {
            //don't tell ourselves
            if (c != originator) {
                c.receive(message);
            }
        }
    }
}
