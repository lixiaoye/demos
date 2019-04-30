package com.example.jvmdemo;

/**
 * Created by lixiaoye on 2019/4/21.
 */

public class Test5 {
    public static void main(String[] args) {//args:{}
        System.out.println(foo(args));//42
    }

    private static int foo(String[] args) {

        try{
            int n=Integer.parseInt(args[0]);//java.lang.IndexOutOfBoundsException : Invalid array range: 0 to 0
            return n;
        }finally {
            return 42;
        }
    }
}
