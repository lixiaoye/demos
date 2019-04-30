package com.example.eventdispatchdemo;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by lixiaoye on 2019/4/19.
 */

public class MyTextView extends AppCompatTextView {
    private static final String TAG = "MyTextView";

    public MyTextView(Context context) {
        this(context, null);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean result = super.dispatchTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyTextView dispatchTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyTextView dispatchTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyTextView dispatchTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyTextView dispatchTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyTextView dispatchTouchEvent() return " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyTextView onTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyTextView onTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyTextView onTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyTextView onTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyTextView onTouchEvent() return " + result);
        return result;
//        return true;
    }
    /**
     * TextView不处理事件，onTouchEvent返回super默认
     * 点击TextView:
     * 04-19 18:00:35.340 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-19 18:00:35.341 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-19 18:00:35.342 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
     04-19 18:00:35.342 32221-32221/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_DOWN

     04-19 18:00:35.342 32221-32221/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_DOWN
     04-19 18:00:35.343 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_DOWN
     04-19 18:00:35.343 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_DOWN

     04-19 18:00:35.413 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-19 18:00:35.413 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_UP
     --------------------------
     * 第二次打印结果：

     *1.事件的分发：从上到下，从Activity到LinearLayout到TextView的dispatchTouchEvent结束
     * 04-19 18:02:38.356 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-19 18:02:38.356 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-19 18:02:38.357 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
     04-19 18:02:38.357 32221-32221/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_DOWN

     * 2.事件的消耗：从下到上，从TextView到LinearLayout到Activity的onTouchEvent结束
     04-19 18:02:38.358 32221-32221/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_DOWN
     04-19 18:02:38.358 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_DOWN
     04-19 18:02:38.359 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_DOWN

     * 3.点击动作的后续事件交给上个事件的最后消耗者
     04-19 18:02:38.383 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:02:38.383 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:02:38.401 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:02:38.402 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:02:38.418 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:02:38.419 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:02:38.435 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:02:38.436 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:02:38.438 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-19 18:02:38.438 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_UP
     */

    /**
     * 触摸LinearLayout并移动手指到TextView：
     * 分析：此场景下并不会调用TextView的dispatchTouchEvent方法
     *
     * 04-19 18:08:51.697 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-19 18:08:51.699 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-19 18:08:51.699 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
     04-19 18:08:51.700 32221-32221/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onTouchEvent() ACTION_DOWN
     04-19 18:08:51.701 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_DOWN
     04-19 18:08:51.723 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:51.723 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:51.773 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:51.774 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:51.789 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:51.789 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:51.806 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:51.806 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:51.824 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:51.824 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:51.874 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:51.874 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:51.891 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:51.891 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     ....
     04-19 18:08:53.432 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:53.432 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:53.435 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-19 18:08:53.435 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_MOVE
     04-19 18:08:53.435 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-19 18:08:53.436 32221-32221/com.example.eventdispatchdemo E/MainActivity: MainActivity onTouchEvent() ACTION_UP
     */

    /**
     * TextView处理消息 onTouchEvent返回true
     *
     * 04-20 01:44:35.971 32301-32301/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_DOWN
     04-20 01:44:35.972 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-20 01:44:35.972 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
     04-20 01:44:35.972 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_DOWN
     04-20 01:44:35.973 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_DOWN

     04-20 01:44:35.986 32301-32301/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-20 01:44:35.986 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-20 01:44:35.987 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_MOVE
     04-20 01:44:35.987 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-20 01:44:35.987 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_MOVE

     04-20 01:44:36.054 32301-32301/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_MOVE
     04-20 01:44:36.055 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-20 01:44:36.055 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_MOVE
     04-20 01:44:36.055 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-20 01:44:36.056 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_MOVE

     04-20 01:44:36.062 32301-32301/com.example.eventdispatchdemo E/MainActivity: MainActivity dispatchTouchEvent() ACTION_UP
     04-20 01:44:36.063 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_UP
     04-20 01:44:36.063 32301-32301/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_UP
     04-20 01:44:36.063 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_UP
     04-20 01:44:36.063 32301-32301/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_UP
     */

   /* 04-22 21:23:05.477 10172-10172/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
04-22 21:23:05.477 10172-10172/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
04-22 21:23:05.478 10172-10172/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_CANCEL
04-22 21:23:05.478 10172-10172/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_CANCEL
04-22 21:23:05.478 10172-10172/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_CANCEL*/
}
