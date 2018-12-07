package classloading.singleton;

/**
 * Created by lixiaoye on 2018/12/5.
 */

public class Singleton {
    private static Singleton singleton = new Singleton();
    public static int value1;
    public static int value2 = 0;


    private Singleton() {
        System.out.println("Singleton construct");
        value1++;
        value2++;
    }



    public static Singleton getInstance() {
        return singleton;
    }
}
