package lxy.android.com.reflectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import lxy.android.com.eventbus.ThreeActivity;

public class SecondActivity extends AppCompatActivity {
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(new Intent(SecondActivity.this, ThreeActivity.class));
            }
        });
        HandlerByTwoWorkThread();
    }

    private void HandlerByTwoWorkThread() {
        //工作线程1：
        Thread hanmeimeiThread = new Thread() {
            @Override
            public void run() {
                Looper.prepare();//必须得调用，否则报错：java.lang.RuntimeException: Can't create handler inside thread that has not called Looper.prepare()
                mHandler = new Handler() {
                    @Override
                    public void handleMessage(Message msg) {
                        Log.d("lixiaoye", "hanMeimei receive message:" + ((String) msg.obj));
                        Toast.makeText(SecondActivity.this, (String) msg.obj, Toast.LENGTH_SHORT).show();
                    }
                };
                Looper.loop();
            }
        };
        //工作线程2：
        Thread liLeiThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.d("lixiaoye", "sleep的线程为：" + Thread.currentThread().getName());
                Message message = mHandler.obtainMessage();
                message.obj = "Hi HanMeimei";
                mHandler.sendMessage(message);
            }
        };
        hanmeimeiThread.setName("韩梅梅 Thread");
        hanmeimeiThread.start();
        liLeiThread.setName("李雷 Thread");
        liLeiThread.start();
    }

}
