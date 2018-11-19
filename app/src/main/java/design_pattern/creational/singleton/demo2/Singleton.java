package design_pattern.creational.singleton.demo2;

import java.io.ObjectStreamException;

/**
 * Created by LIXIAOYE on 2018/11/5.
 */

public class Singleton {
    private static Singleton sInstance;

    private Singleton() {
    }

    public static synchronized Singleton getsInstance() {
        if (sInstance == null) {
            sInstance = new Singleton();
        }
        return sInstance;
    }

    private Object readResolve() throws ObjectStreamException {
        return sInstance;
    }
}
