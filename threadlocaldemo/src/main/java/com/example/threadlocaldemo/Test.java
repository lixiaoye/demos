package com.example.threadlocaldemo;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaoye on 2019/3/4.
 */

public class Test {
    public static void main(String[] args) {
        SimpleThreadLocal<List<String>> threadLocal = new SimpleThreadLocal<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> params = new ArrayList<>(3);
                params.add("傲慢与偏见");
                params.add("飘");
                params.add("简爱");
                threadLocal.set(params);
                System.out.println(Thread.currentThread().getName());
                threadLocal.get().forEach(p -> System.out.println(p));
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    List<String> params = new ArrayList<>(2);
                    params.add("amy tan");
                    params.add("russell");
                    threadLocal.set(params);
                    System.out.println(Thread.currentThread().getName());
                    threadLocal.get().forEach(p -> System.out.println(p));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
    /**
     Thread-0
     傲慢与偏见
     飘
     简爱
     Thread-1
     amy tan
     russell
     */
}
