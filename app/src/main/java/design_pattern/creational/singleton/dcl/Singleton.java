package design_pattern.creational.singleton.dcl;

/**
 * Created by LIXIAOYE on 2018/11/5.
 */

public class Singleton {
    //    private static Singleton sInstance = null;
    private volatile static Singleton sInstance = null;

    private Singleton() {
    }

    public void doSomething() {
        System.out.println("do sth.");
    }

    public static Singleton getInstance() {
        if (sInstance == null) {
            synchronized (Singleton.class) {
                if (sInstance == null) {
                    sInstance = new Singleton();
                }
            }
        }
        return sInstance;
    }
}
