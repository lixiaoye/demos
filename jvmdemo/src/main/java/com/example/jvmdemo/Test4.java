package com.example.jvmdemo;

/**
 * Created by lixiaoye on 2019/4/21.
 */

public class Test4 {
    public static void main(String[] args) {
        System.out.println(test());//什么也不会输出
    }

    /**
     * //此例子中，finally块将不会执行
     * 在这种情况下，JVM将停止，而不执行finally块
     * @return
     */
    private static String test() {
        try {
            System.exit(0);
        } finally {
            return "2";
        }
    }
}
