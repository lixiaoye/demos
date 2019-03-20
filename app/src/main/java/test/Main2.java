package test;

/**
 * Created by lixiaoye on 2019/3/20.
 */
class Test3 {
    static int i;
    int j;

    static {
        i = 10;
        System.out.println("static block called ");
    }

    Test3() {
        System.out.println("Constructor called ");
    }
}

public class Main2 {
    public static void main(String[] args) {
// Although we have two objects, static block is executed only once.
        Test3 t1 = new Test3();
        Test3 t2 = new Test3();
    }
    /**
     * 打印结果：
     static block called
     Constructor called
     Constructor called
     */
}
