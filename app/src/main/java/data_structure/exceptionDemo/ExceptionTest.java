package data_structure.exceptionDemo;

/**
 * Created by LIXIAOYE on 2018/8/17.
 */

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int result = divide(4, 1);
            System.out.println("result=" + result);
            System.exit(0);
        } catch (Exception e) {
            System.out.println("捕获的异常信息为：" + e.getMessage());
        } finally {
            System.out.println("进入了finally代码块");
        }
        System.out.println("程序继续向下执行...");
    }

    /**
     * 打印结果：
     * result=4
     */

    private static int divide(int x, int y) {
        return x / y;
    }
}
