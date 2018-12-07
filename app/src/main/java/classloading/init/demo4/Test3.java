package classloading.init.demo4;

/**
 * Created by lixiaoye on 2018/12/6.
 */

public class Test3 {
    {
        System.out.println("static block 1...");
    }

    public Test3() {
        System.out.println("construct...");
    }

    {
        System.out.println("static block 2...");
    }

    public static void main(String[] args) {
        new Test3();
        new Test3();
    }
    /**
     * 打印结果：
     static block 1...
     static block 2...
     construct...
     static block 1...
     static block 2...
     construct...
     */
}
