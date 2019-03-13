package lxy.android.com.mvpdemo.after.demo1;


import android.os.Handler;
import android.os.Message;

import java.util.Random;

/**
 * Created by LIXIAOYE on 2019/1/24.
 */

public class MVPModel {
    private Callback callback;

    protected MVPModel(Callback callback) {
        this.callback = callback;
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            callback.onResult((String) msg.obj);
        }
    };

    public void request() {
        //工作线程进行网络请求
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    String s = "mvp 服务器返回数据：2 - " + new Random().nextInt(10);
                    //将结果通知给presenter
                    Message msg = handler.obtainMessage();
                    msg.obj = s;
                    handler.sendMessage(msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void removeTask() {
        handler.removeCallbacksAndMessages(null);
    }
}
