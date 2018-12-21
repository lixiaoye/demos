package lxy.android.com.reflectdemo;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final int MESSAGE_WHAT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        sendMessage2MainThreadByWorkThread();
        startActivity(new Intent(this, SecondActivity.class));
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MESSAGE_WHAT:
                    Log.d("lixiaoye", "main thread receiver message:" + ((String) msg.obj));
            }

        }
    };

    private void sendMessage2MainThreadByWorkThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message msg = mHandler.obtainMessage(MESSAGE_WHAT);
                msg.obj = "I am message from work thread";
                mHandler.sendMessage(msg);
            }
        }).start();
    }
}















