package com.example.intentservicedemo.IntentService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.intentservicedemo.R;
import com.example.intentservicedemo.handlerThread.HandlerThreadActivity;

public class MainActivity extends AppCompatActivity {
    public static final String ACTION_START_SERVICE = "action_start_service";
    public static final String ACTION_PROGRESS_RATE = "action_pb_rate";
    private TextView tv_status, tv_rate;
    private ProgressBar progressBar;
    private LocalBroadcastManager mLocalBroadcastManager;//广播
    private BroadcastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mLocalBroadcastManager=LocalBroadcastManager.getInstance(this);
        mReceiver=new MyBroadcastReceiver();
        IntentFilter filter=new IntentFilter();
        filter.addAction(ACTION_PROGRESS_RATE);
        mLocalBroadcastManager.registerReceiver(mReceiver,filter);

    }

    private void initView() {
        tv_status = findViewById(R.id.progress_status);
        tv_rate = findViewById(R.id.progress_rate);
        progressBar = findViewById(R.id.progress);

    }

    public void clickBtn1(View view) {
        startIntentService();
    }

    public void clickBtn2(View view) {
        startProgressService();
    }
    public void clickBtn3(View view) {
        startActivity(new Intent(this, HandlerThreadActivity.class));
    }

    private void startProgressService() {
        Intent intent = new Intent(this, ProgressIntentService.class);
        intent.setAction(ProgressIntentService.ACTION_PROGRESS);
        this.startService(intent);
    }

    private void startIntentService() {
        Intent intent = new Intent(this, MyIntentService.class);
        intent.setAction(ACTION_START_SERVICE);
//        intent.putExtra();
        startService(intent);
    }

    private class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()){
                case ACTION_PROGRESS_RATE:
                    int rate=intent.getIntExtra("rate",0);
                    tv_status.setText("线程状态："+intent.getStringExtra("status"));
                    tv_rate.setText(rate+"%");
                    progressBar.setProgress(rate);
                    if (rate>=100){
                        tv_status.setText("加载完成");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
