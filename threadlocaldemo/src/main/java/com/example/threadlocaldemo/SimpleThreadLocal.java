package com.example.threadlocaldemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiaoye on 2019/3/4.
 */

public class SimpleThreadLocal<T> {
    /**
     * key为线程对象，value为传入的值对象
     */
    private Map<Thread, T> valueMap = Collections.synchronizedMap(new HashMap<Thread, T>());

    /**
     * 设置
     *
     * @param value Map键值对的value
     */
    public void set(T value) {
        valueMap.put(Thread.currentThread(), value);
    }

    /**
     * 取值
     *
     * @return
     */
    public T get() {
        Thread currentThread = Thread.currentThread();
        //返回当前线程对应的变量
        T t = valueMap.get(currentThread);
        if (t == null || !valueMap.containsKey(currentThread)) {
            //如果当前线程在Map中不存在，则将当前线程存储到Map中
            t = initialValue();
            valueMap.put(currentThread, t);
        }
        return t;
    }

    public void remove() {
        valueMap.remove(Thread.currentThread());
    }

    private T initialValue() {
        return null;
    }
}
