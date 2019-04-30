package com.example.jvmdemo;

/**
 * Created by lixiaoye on 2019/4/21.
 */

public class Test2 {
    public static void main(String[] args) {
        System.out.println(getValue());//2
    }

    public static int getValue() {
        try{
            return 1;
        }finally {
            return 2;
        }
    }
}
