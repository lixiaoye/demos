package classloading.singleton;

/**
 * Created by lixiaoye on 2018/12/5.
 */

public class Singleton2 {
    public static int value1;
    public static int value2 = 0;
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
        System.out.println("Singleton 2construct");
        value1++;
        value2++;
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }

}
