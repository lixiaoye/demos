package design_pattern.behavioral.observer.demo1;

import java.sql.SQLOutput;
import java.util.Observable;
import java.util.Observer;

/**
 * 程序员是观察者
 */

public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi," + name + ",DevTechFrontier更新啦，内容:" + arg);
    }

    @Override
    public String toString() {
        return "码农：" + name;
    }
}
