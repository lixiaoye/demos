package classloading.init.demo;


/**
 * Created by lixiaoye on 2018/12/5.
 */

public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}
