package classloading.init.demo4;

/**
 * Created by lixiaoye on 2018/12/6.
 */

public class Modal {
    public Modal() {
        System.out.println("Modal construct...");
    }

    {
        System.out.println("Modal non-static initializer block...");
    }

    static {
        System.out.println("Modal static block...");
    }


}
