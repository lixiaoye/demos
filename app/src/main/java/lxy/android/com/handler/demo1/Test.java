package lxy.android.com.handler.demo1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/**
 * Created by LIXIAOYE on 2018/12/13.
 */

public class Test {
    private Handler mHandler;
    public static void main(String[] args) {

    }
    private void handlerThread1(){
        Thread hanMeimeiThread=new Thread(){
            @Override
            public void run() {
                super.run();
                Looper.prepare();
                mHandler=new Handler(){
                    @Override
                    public void handleMessage(Message msg) {
                        super.handleMessage(msg);
                        Log.d("lixiaoye","hanMeiMei receive message:"+((String)msg.obj));

                    }
                };
            }
        };
    }
}
