package classloading.init.demo;

/**
 * Created by lixiaoye on 2018/12/5.
 */

public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}
