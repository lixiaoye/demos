package classloading.init.demo4;

/**
 * Created by lixiaoye on 2018/12/6.
 */

public class Test2 {
    public static void main(String[] args) {
        {
            int x = 3;
            System.out.println("1:普通代码块内的变量x=" + x);
        }
        int x = 1;
        System.out.println("main()方法内的变量x=" + x);
        {
            int y = 5;
            System.out.println("2:普通代码块内的变量y=" + y);
            System.out.println("2:普通代码块内的变量x=" + x);
        }
    }
    /**
     * 打印结果：
         1:普通代码块内的变量x=3
         main()方法内的变量x=1
         2:普通代码块内的变量y=5
         2:普通代码块内的变量x=1
     */
}
