package com.example.intentservicedemo.IntentService;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by lixiaoye on 2019/3/2.
 */

public class MyIntentService extends IntentService {
    private static final String TAG = "IntentService";

    public MyIntentService(){
        super("MyIntentService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "onCreate");
    }
    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.e(TAG, "onStart");
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Log.e(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onBind");
        return super.onBind(intent);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.e(TAG, "onHandleIntent");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }
    /**
     * 03-02 21:58:28.690 30902-30902/com.example.intentservicedemo E/IntentService: onCreate
     03-02 21:58:28.690 30902-30902/com.example.intentservicedemo E/IntentService: onStartCommand
     03-02 21:58:28.690 30902-30902/com.example.intentservicedemo E/IntentService: onStart
     03-02 21:58:28.690 30902-30970/com.example.intentservicedemo E/IntentService: onHandleIntent
     03-02 21:58:28.692 30902-30902/com.example.intentservicedemo E/IntentService: onDestroy
     */
}
