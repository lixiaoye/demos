package test;

/**
 * Created by lixiaoye on 2019/3/20.
 */

class Test2 {
    static int i;//类变量
    int j;//实例变量

    //start of static block
    static {
        i = 10;
        System.out.println("static block called ");
    }
    //end of static block
}

public class Main {
    public static void main(String[] args) {
        // Although we don't have an object of Test, static block is 
        // called because i is being accessed in following statement.
        System.out.println(Test2.i);
    }
    /**
     * 打印结果：
     static block called
     10
     */
}
