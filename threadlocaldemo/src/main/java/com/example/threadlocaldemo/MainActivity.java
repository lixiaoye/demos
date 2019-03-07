package com.example.threadlocaldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.xml.transform.sax.TemplatesHandler;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ThreadLocalActivity";

    private ThreadLocal<Boolean> mBooleanThreadLocal = new ThreadLocal<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBooleanThreadLocal.set(true);
        Object obj=new Object();
        Log.e(TAG, Thread.currentThread().getName() + " mBooleanThreadLocal=" + mBooleanThreadLocal.get());
        new Thread("Thread 1") {
            @Override
            public void run() {
                mBooleanThreadLocal.set(false);
                Log.e(TAG, Thread.currentThread().getName() + " mBooleanThreadLocal=" + mBooleanThreadLocal.get());

            }
        }.start();
        new Thread("Thread 2") {
            @Override
            public void run() {
                Log.e(TAG, Thread.currentThread().getName() + " mBooleanThreadLocal=" + mBooleanThreadLocal.get());

            }
        }.start();
    }
    /**
     03-04 17:36:40.252 29883-29883/? E/ThreadLocalActivity: main mBooleanThreadLocal=true
     03-04 17:36:40.253 29883-29927/? E/ThreadLocalActivity: Thread 1 mBooleanThreadLocal=false
     03-04 17:36:40.254 29883-29928/? E/ThreadLocalActivity: Thread 2 mBooleanThreadLocal=null

     */
}
