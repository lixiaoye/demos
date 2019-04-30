package com.example.jvmdemo;

/**
 * Created by lixiaoye on 2019/4/21.
 */

public class TestSogou {
    /**
     * synchronized干扰，这里没有互斥，只是造成干扰
     * synchronized是做互斥锁的，跟正常线程执行没有什么区别
     * @param args
     */
    public static synchronized void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                Sogou();
            }
        };
        /**
         * run()方法不会开启线程，它直接调用，这样全程只有一个main主线程，
         * 从上到下执行，
         * 所以打印结果为：SogouHello
         */
        t.run();//run方法不会开启线程，只会直接执行
        /**
         * start()开启线程
         * 打印结果：Hello Sogou
         */
//        t.start();//匿名内部类开启线程
        System.out.print("Hello ");
    }
    static synchronized void Sogou(){
        System.out.print("Sogou");
    }
}
