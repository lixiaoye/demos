package classloading.singleton;

/**
 * Created by lixiaoye on 2018/12/5.
 */

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton1 value1=" + singleton.value1);
        System.out.println("Singleton1 value2=" + singleton.value2);

        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println("Singleton2 value1=" + singleton2.value1);
        System.out.println("Singleton2 value2=" + singleton2.value2);
    }
    /**
     * Singleton1 value1=1
     Singleton1 value2=0
     Singleton2 value1=1
     Singleton2 value2=1

     */
}
