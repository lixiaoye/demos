package com.example.threadlocaldemo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ThreadId类生成每个线程本地的唯一标识符
 * 线程的ID在第一次调用ThreadId#get()方法时被分配，在随后的调用中保持不变
*/
public class ThreadId {
    //AtomicInteger包含下一个要分配的线程ID的原子整数
    private static final AtomicInteger nextId = new AtomicInteger(0);

    //包含每个线程ID的线程局部变量
    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };

    /**
     * 返回当前线程的唯一ID，必要时分配它
     * @return
     */
    public static int get() {
        return threadId.get();
    }

    /**
     * 只要线程处于活动状态且线程本地实例可访问，每个线程都会保留对其线程本地变量副本的隐式引用；
     * 线程离开后，其所有线程本地实例副本都将被垃圾收集（除非存在对这些副本的其他引用）。
     */
}
