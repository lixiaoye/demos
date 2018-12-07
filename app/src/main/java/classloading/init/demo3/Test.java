package classloading.init.demo3;

import static classloading.init.demo3.StaticClass.init;

/**
 * Created by lixiaoye on 2018/12/6.
 */

public class Test {
    private Test(){
        System.out.println("Test construct...");
    }
    public static void main(String[] args) {
        System.out.println("Test main()...");
//        init();
        /**
         * StaticClass static block!
         init method
         init method
         */

    }
}
