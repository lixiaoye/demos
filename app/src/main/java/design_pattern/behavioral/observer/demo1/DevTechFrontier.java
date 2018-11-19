package design_pattern.behavioral.observer.demo1;

import java.util.Observable;

/**
 * DevTechFrontier即开发技术前线，这个网站是被观察者角色，
 * 当它有更新时所有的观察者（此处指程序员）都会接到相应的通知。
 */

public class DevTechFrontier extends Observable {
    public void postNewPublication(String content) {
        //标识状态或内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
