package com.example.jvmdemo;

import android.app.Activity;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
//    private Button btn;
    private ImageView iv;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        tv = findViewById(R.id.tv);
//        btn = findViewById(R.id.btn1);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e(TAG, "Button onClick execute");
//            }
//        });
//        btn.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e(TAG, "Button onTouch execute,action:" + event.getAction());
//                return true;
//            }
//        });
        iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e(TAG, "ImageView onTouch execute,action:" + event.getAction());
                return false;
            }
        });
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "ImageView onClick execute");
            }
        });
        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e(TAG, "TextView onTouch execute,action:" + event.getAction());
                return true;
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "TextView onClick execute");
            }
        });

        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(1, "a");
        sparseArray.put(5, "e");
        sparseArray.put(4, "d");
        sparseArray.put(10, "h");
        sparseArray.put(2, null);
        Log.e(TAG,sparseArray.toString());//04-22 16:43:06.600 10453-10453/? E/MainActivity: {1=a, 2=null, 4=d, 5=e, 10=h}
/**
 * 按钮Button
 * onTouch返回false，打印结果：
 04-17 10:53:15.348 14232-14232/com.example.jvmdemo E/MainActivity: Button onTouch execute,action:0
 04-17 10:53:15.374 14232-14232/com.example.jvmdemo E/MainActivity: Button onTouch execute,action:2
 04-17 10:53:15.452 14232-14232/com.example.jvmdemo E/MainActivity: Button onTouch execute,action:2
 04-17 10:53:15.457 14232-14232/com.example.jvmdemo E/MainActivity: Button onTouch execute,action:1
 04-17 10:53:15.460 14232-14232/com.example.jvmdemo E/MainActivity: Button onClick execute
 */
/**
 *
 *  onTouch返回true，打印结果：
 04-17 10:55:57.060 15443-15443/com.example.jvmdemo E/MainActivity: Button onTouch execute,action:0
 04-17 10:55:57.095 15443-15443/com.example.jvmdemo E/MainActivity: Button onTouch execute,action:2
 04-17 10:55:57.099 15443-15443/com.example.jvmdemo E/MainActivity: Button onTouch execute,action:1
 */

/**
 * ImageView
 * onTouch返回false，打印结果：
 * 04-19 20:12:54.959 28891-28891/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:0
 04-19 20:12:54.978 28891-28891/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:2
 04-19 20:12:55.127 28891-28891/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:2
 04-19 20:12:55.129 28891-28891/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:1
 04-19 20:12:55.132 28891-28891/com.example.jvmdemo E/MainActivity: ImageView onClick execute
 *  onTouch返回true，打印结果：
 04-19 20:16:18.362 29783-29783/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:0
 04-19 20:16:18.416 29783-29783/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:2
 04-19 20:16:18.473 29783-29783/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:2
 04-19 20:16:18.474 29783-29783/com.example.jvmdemo E/MainActivity: ImageView onTouch execute,action:1
 04-19 20:16:18.482 29783-29783/com.example.jvmdemo E/MainActivity: ImageView onClick execute
 */


/**
 * TextView
 * onTouch返回true，打印结果：
 * 04-19 20:04:25.993 25484-25484/com.example.jvmdemo E/MainActivity: TextView onTouch execute,action:0
 04-19 20:04:26.019 25484-25484/com.example.jvmdemo E/MainActivity: TextView onTouch execute,action:2
 04-19 20:04:26.102 25484-25484/com.example.jvmdemo E/MainActivity: TextView onTouch execute,action:2
 04-19 20:04:26.129 25484-25484/com.example.jvmdemo E/MainActivity: TextView onTouch execute,action:1
--------------
 * onTouch返回false，打印结果：
 04-19 20:12:33.475 28891-28891/com.example.jvmdemo E/MainActivity: TextView onTouch execute,action:0
 04-19 20:12:33.512 28891-28891/com.example.jvmdemo E/MainActivity: TextView onTouch execute,action:1
 04-19 20:12:33.526 28891-28891/com.example.jvmdemo E/MainActivity: TextView onClick execute
 */
    }
}
