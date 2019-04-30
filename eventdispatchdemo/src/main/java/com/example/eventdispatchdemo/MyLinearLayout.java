package com.example.eventdispatchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;


/**
 * Created by lixiaoye on 2019/4/19.
 */

public class MyLinearLayout extends LinearLayout {
    public static final String TAG = "MyLinearLayout";

    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean result=super.dispatchTouchEvent(ev);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyLinearLayout dispatchTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyLinearLayout dispatchTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyLinearLayout dispatchTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyLinearLayout dispatchTouchEvent() ACTION_CANCEL");
                break;

        }
        Log.e(TAG, "MyLinearLayout dispatchTouchEvent() return " +result);
        return result;
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean result = super.onInterceptTouchEvent(ev);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyLinearLayout onInterceptTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyLinearLayout onInterceptTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyLinearLayout onInterceptTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyLinearLayout onInterceptTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyLinearLayout onInterceptTouchEvent() return " + result);
        return result;
//        return false;
//        return true;

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyLinearLayout onTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyLinearLayout onTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyLinearLayout onTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyLinearLayout onTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyLinearLayout onTouchEvent() return " +result);
        return result;
//        return true;
    }
    /**
     *
     * onInterceptTouchEvent返回true，即拦截事件，拦截后不处理，返回默认super
     * 点击Button，并抬起
     *
     * 04-20 00:19:32.907 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-20 00:19:32.908 7990-7990/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-20 00:19:32.908 7990-7990/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN

     04-20 00:19:32.909 7990-7990/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_DOWN
     04-20 00:19:32.909 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_DOWN

     04-20 00:19:32.935 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-20 00:19:32.935 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-20 00:19:33.020 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-20 00:19:33.021 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-20 00:19:33.023 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-20 00:19:33.023 7990-7990/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_UP
     */

    /**
     * onInterceptTouchEvent返回true，即拦截事件，拦截后不处理，即返回默认super
     *
     * 点击TextView并抬起
     *
     * 1.事件的分发：从上到下，从Activity到LinearLayout的dispatchTouchEvent结束
     04-20 00:24:39.148 9616-9616/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-20 00:24:39.148 9616-9616/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-20 00:24:39.149 9616-9616/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN

     2.事件的消耗：从下到上，从LinearLayout到Activity的onTouchEvent结束
     04-20 00:24:39.149 9616-9616/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_DOWN
     04-20 00:24:39.150 9616-9616/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_DOWN

     * 3.点击动作的后续事件交给上个事件的最后消耗者
     04-20 00:24:39.207 9616-9616/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-20 00:24:39.208 9616-9616/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-20 00:24:39.210 9616-9616/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-20 00:24:39.210 9616-9616/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_UP
     */

    /**
     * onInterceptTouchEvent返回true，即拦截事件，拦截后处理，即返回true
     *
     04-20 01:53:28.851 3763-3763/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-20 01:53:28.852 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-20 01:53:28.852 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
     04-20 01:53:28.853 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_DOWN

     04-20 01:53:28.877 3763-3763/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-20 01:53:28.877 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-20 01:53:28.878 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_MOVE

     04-20 01:53:28.968 3763-3763/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-20 01:53:28.969 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-20 01:53:28.969 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_MOVE

     04-20 01:53:28.971 3763-3763/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-20 01:53:28.971 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_UP
     04-20 01:53:28.972 3763-3763/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_UP

     */
}
