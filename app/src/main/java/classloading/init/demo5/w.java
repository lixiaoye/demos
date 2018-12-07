package classloading.init.demo5;

/**
 * Created by lixiaoye on 2018/12/6.
 */

class Modal {
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

public class w {
    public static void main(String[] args) {
        Modal modal = new Modal();
        Modal modal2 = new Modal();
/**
 Modal static block...
 Modal non-static initializer block...
 Modal construct...
 Modal non-static initializer block...
 Modal construct...
 */
    }
}