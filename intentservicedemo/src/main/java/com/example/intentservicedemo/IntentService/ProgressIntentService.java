package com.example.intentservicedemo.IntentService;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;

/**
 * Created by lixiaoye on 2019/3/2.
 */

public class ProgressIntentService extends IntentService {
    private static final String TAG = "ProgressIntentService";
    public static final String ACTION_PROGRESS = "action_progress";
    private boolean isRunning;//是否正在运行
    private int count;//进度
    private LocalBroadcastManager mLocalBroadcastManager;//广播


    public ProgressIntentService() {
        super(TAG);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mLocalBroadcastManager = LocalBroadcastManager.getInstance(this);
    }


    /**
     * 在onHandleIntent方法中让进度自增，每次自增后睡眠50ms并向Activity中发送广播并传递进度数据
     *
     * @param intent
     */
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        switch (intent.getAction()) {
            case ACTION_PROGRESS:
                try {
                    //模拟耗时操作
                    Thread.sleep(1000);
                    isRunning = true;
                    count = 0;
                    while (isRunning) {
                        count++;
                        if (count >= 100) {
                            isRunning = false;
                        }
                        Thread.sleep(50);
                        sendProgressStatus("running", count);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            default:
                break;
        }
    }

    /**
     * 发送进度消息
     *
     * @param running
     * @param count
     */
    private void sendProgressStatus(String running, int count) {
        Intent intent = new Intent(MainActivity.ACTION_PROGRESS_RATE);
        intent.putExtra("status", running);
        intent.putExtra("rate", count);
        mLocalBroadcastManager.sendBroadcast(intent);
    }

}
