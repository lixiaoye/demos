package com.example.eventdispatchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by lixiaoye on 2019/4/19.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton {
    private static final String TAG = "MyButton";

    public MyButton(Context context) {
        this(context, null);
    }

    public MyButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean result = super.dispatchTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyButton dispatchTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyButton dispatchTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyButton dispatchTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyButton dispatchTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyButton dispatchTouchEvent() return " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyButton onTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyButton onTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyButton onTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyButton onTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyButton onTouchEvent() return " + result);
        return result;
    }
    /**
     *1.事件的分发：从上到下，从Activity到LinearLayout到Button的dispatchTouchEvent结束
     * 04-19 21:05:22.737 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-19 21:05:22.739 14691-14691/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-19 21:05:22.739 14691-14691/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
     04-19 21:05:22.739 14691-14691/com.example.eventdispatchdemo E/MyButton: MyButton dispatchTouchEvent() ACTION_DOWN

     2.事件的消耗：从下到上，从Button到LinearLayout到Activity的onTouchEvent结束
     04-19 21:05:22.740 14691-14691/com.example.eventdispatchdemo E/MyButton: MyButton onTouchEvent() ACTION_DOWN
     04-19 21:05:22.741 14691-14691/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_DOWN
     04-19 21:05:22.741 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_DOWN

     3.点击动作的后续事件交给上个事件的最后消耗者
     04-19 21:05:22.760 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 21:05:22.761 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 21:05:22.777 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 21:05:22.777 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 21:05:22.868 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-19 21:05:22.869 14691-14691/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_UP
     */

}
