package classloading.init.demo3;

/**
 * Created by lixiaoye on 2018/12/6.
 */

public class StaticClass {
    static {
        System.out.println("StaticClass static block!");
        init();
    }

    private StaticClass() {
        System.out.println("StaticClass construct..." +
                "" +
                "");
    }

    public static void init() {
        //do some initialization here
        System.out.println("init method");
    }

}
