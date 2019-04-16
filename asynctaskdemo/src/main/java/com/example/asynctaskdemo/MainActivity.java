package com.example.asynctaskdemo;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity implements Listener {
    private static final String TAG = "AsyncTask-MainActivity";
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text);
        Runtime.getRuntime().maxMemory();
    }

    public void onClick(View view) {
        //默认串行
        new MyAsyncTask("AsyncTask#1", this).execute("");
        new MyAsyncTask("AsyncTask#2", this).execute("");
        new MyAsyncTask("AsyncTask#3", this).execute("");
        new MyAsyncTask("AsyncTask#4", this).execute("");
//        new MyAsyncTask("AsyncTask#5", this).execute("");

//        //并行
//        new MyAsyncTask("AsyncTask#1", this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,"");
//        new MyAsyncTask("AsyncTask#2", this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,"");
//        new MyAsyncTask("AsyncTask#3", this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,"");
//        new MyAsyncTask("AsyncTask#4", this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,"");
//        new MyAsyncTask("AsyncTask#5", this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,"");


    }

    @Override
    public void onComplete(String s) {
        tv.setText(s);
    }

    private static class MyAsyncTask extends AsyncTask<String, Integer, String> {


        private String mName = "AsyncTask";
        private Listener mListener;

        public MyAsyncTask(String mName, Listener listener) {
            this.mName = mName;
            this.mListener = listener;
        }

        @Override
        protected String doInBackground(String... strings) {
            //模拟耗时操作
            try {
                Thread.sleep(3000);//3秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return mName;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = sdf.format(new Date());
            Log.e(TAG, mName+" execute finish at " + dateStr);
            mListener.onComplete(dateStr);
        }
    }
/**
 * ********串行***********
 04-03 23:26:22.120 8341-8341/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#1 execute finish at 2019-04-03 23:26:22
 04-03 23:26:25.157 8341-8341/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#2 execute finish at 2019-04-03 23:26:25
 04-03 23:26:28.183 8341-8341/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#3 execute finish at 2019-04-03 23:26:28
 04-03 23:26:31.231 8341-8341/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#4 execute finish at 2019-04-03 23:26:31
 04-03 23:26:34.272 8341-8341/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#5 execute finish at 2019-04-03 23:26:34

 **********并行************
 04-03 23:29:11.619 9006-9006/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#1 execute finish at 2019-04-03 23:29:11
 04-03 23:29:11.631 9006-9006/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#2 execute finish at 2019-04-03 23:29:11
 04-03 23:29:11.640 9006-9006/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#4 execute finish at 2019-04-03 23:29:11
 04-03 23:29:11.647 9006-9006/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#3 execute finish at 2019-04-03 23:29:11
 04-03 23:29:14.660 9006-9006/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#5 execute finish at 2019-04-03 23:29:14
 ***************************************
 * 如果只开启4个AysnTask
 * ***********串行****************
 04-03 23:33:41.114 10308-10308/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#1 execute finish at 2019-04-03 23:33:41
 04-03 23:33:44.160 10308-10308/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#2 execute finish at 2019-04-03 23:33:44
 04-03 23:33:47.188 10308-10308/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#3 execute finish at 2019-04-03 23:33:47
 04-03 23:33:50.215 10308-10308/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#4 execute finish at 2019-04-03 23:33:50

 * ********并行****************
 04-03 23:31:10.881 9604-9604/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#3 execute finish at 2019-04-03 23:31:10
 04-03 23:31:10.896 9604-9604/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#4 execute finish at 2019-04-03 23:31:10
 04-03 23:31:10.906 9604-9604/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#2 execute finish at 2019-04-03 23:31:10
 04-03 23:31:10.917 9604-9604/com.example.asynctaskdemo E/AsyncTask-MainActivity: AsyncTask#1 execute finish at 2019-04-03 23:31:10
 */
}
