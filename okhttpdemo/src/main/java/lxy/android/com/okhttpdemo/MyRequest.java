package lxy.android.com.okhttpdemo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by LIXIAOYE on 2019/2/18.
 */

public class MyRequest {
    public static void main(String[] args) {
        MyRequest myRequest = new MyRequest();
//        myRequest.getAsyncHttp();
        /**
         * 报错：
         * Exception in thread "OkHttp Dispatcher" java.lang.RuntimeException: Stub!
         at android.text.TextUtils.isEmpty(TextUtils.java:64)
         at lxy.android.com.okhttpdemo.MyRequest$1.onResponse(MyRequest.java:41)
         at okhttp3.RealCall$AsyncCall.execute(RealCall.java:133)
         at okhttp3.internal.NamedRunnable.run(NamedRunnable.java:32)
         at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
         at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
         at java.lang.Thread.run(Thread.java:745)
         */
    }


}
