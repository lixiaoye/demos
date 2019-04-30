package com.example.jvmdemo;

/**
 * Created by lixiaoye on 2019/4/21.
 */

public class Test3 {
    public static void main(String[] args) {
        System.out.println(Test3.test());
    }

    private static String test() {
        try{
            System.out.println("try");
            throw new Exception();
        }catch (Exception e){
            System.out.println("catch");
            return "return";
        }finally {
            System.out.println("finally");
            return "return in finally";
        }
    }
    /**
     * 打印结果：
     try
     catch
     finally
     return in finally
     */
}
