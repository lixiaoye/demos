package com.example.jvmdemo;

/**
 * Created by lixiaoye on 2019/4/21.
 */

public class Test6 {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;
        while (n > 0) {
            /**
             * 二进制
             n和n-1做一次与运算，发现二进制最右边的1会0，
             理论上说，while能作几轮运算，取决与n的二进制中有几个1.
             */
            n = (n - 1) & n;
            count++;
        }
        System.out.println(count);
        /**
         * n=2 （10:1个1）; //count=1;
         * 10 & 01 = 00
         */
        /**
         * n=9; 1001 （2个1） count=2;
         *可做两轮运算
         * 1001 & 1000 = 1000
         * 1000 & 0111 = 0000
         */
        /***
         * n=13 （1101 共3个次，可做三轮运算）//count=3;
         * 1101 & 1100 = 1100
         * 1100 & 1011 = 1000
         * 1000 & 0111 = 0000
         */
    }
}
