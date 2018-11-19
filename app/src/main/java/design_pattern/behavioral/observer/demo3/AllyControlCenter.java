package design_pattern.behavioral.observer.demo3;

import java.util.ArrayList;

/**
 * 战队控制中心类：目标类
 */

public abstract class AllyControlCenter {
    protected String allyName;//战队名称
    protected ArrayList<Observer> players = new ArrayList<Observer>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    //注册方法
    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allyName + "战队！");
        players.add(observer);
    }

    //注销方法
    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + this.allyName + "战队！");
        players.remove(observer);
    }

    //声明抽象通知方法
    public abstract void notifyObserver(String name);

}























