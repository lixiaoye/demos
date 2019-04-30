package com.example.jvmdemo;

import android.util.SparseArray;

/**
 * Created by lixiaoye on 2019/4/22.
 */

public class SparseArrayTest {
    public static void main(String[] args) {
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(1, "a");
        sparseArray.put(5, "e");
        sparseArray.put(4, "d");
        sparseArray.put(10, "h");
        sparseArray.put(2, null);
        System.out.println(sparseArray);
        /**
         * Exception in thread "main" java.lang.RuntimeException: Stub!
         at android.util.SparseArray.<init>(SparseArray.java:21)
         at com.example.jvmdemo.SparseArrayTest.main(SparseArrayTest.java:11)
         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
         at java.lang.reflect.Method.invoke(Method.java:498)
         at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
         注意：只能在Android平台上调用
         */
    }
}
