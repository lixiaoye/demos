package com.example.eventdispatchdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public static final String TAG = "MainActivity";
    private MyLinearLayout myLinearLayout;
    private TextView textView;
    private MyButton myButton;
    private LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_main2);
//        setContentView(R.layout.activity_main3);
//        ll = findViewById(R.id.ll);
        myLinearLayout = findViewById(R.id.myLinearLayout);
//        textView = findViewById(R.id.view);
//        myButton = findViewById(R.id.btn1);
        myLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"LinearLayout的onClick执行了",Toast.LENGTH_SHORT).show();
                Log.e(TAG,"LinearLayout的onClick执行了");
                // 04-20 02:14:29.458 11874-11874/com.example.eventdispatchdemo E/MainActivity: LinearLayout的onClick执行了
                //不需要设置enable为true，clickable为true
            }
        });
    }

    public void clickNext(View view){
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MainActivity dispatchTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MainActivity dispatchTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MainActivity dispatchTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MainActivity dispatchTouchEvent() ACTION_CANCEL");
                break;
        }
//        requestDisallowInterceptTouchEvent(ll,true);
        return super.dispatchTouchEvent(ev);
    }

    private void requestDisallowInterceptTouchEvent(ViewGroup viewGroup, boolean b) {
        viewGroup.requestDisallowInterceptTouchEvent(b);
        int childCount=viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child= viewGroup.getChildAt(i);
            if (child instanceof ViewGroup){
                requestDisallowInterceptTouchEvent((ViewGroup) child,b);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MainActivity onTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MainActivity onTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MainActivity onTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MainActivity onTouchEvent() ACTION_CANCEL");
                break;
        }
        return super.onTouchEvent(event);
//        return true;
    }

}
