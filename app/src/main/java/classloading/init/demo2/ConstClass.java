package classloading.init.demo2;

/**
 * Created by lixiaoye on 2018/12/5.
 */

public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";
}
