package lxy.android.com.mvpdemo.prev;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

/**
 * Created by LIXIAOYE on 2019/1/28.
 */

public class HttpModel {
    private TextView tv;

    public HttpModel(TextView tv) {
        this.tv = tv;
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            tv.setText((String) msg.obj);
        }
    };

    public void request() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    Message msg = handler.obtainMessage();
                    msg.obj = "从网络中获取到的数据";
                    handler.sendMessage(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
