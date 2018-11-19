package design_pattern.creational.singleton.inner;

/**
 * Created by LIXIAOYE on 2018/11/5.
 */

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }

}






















