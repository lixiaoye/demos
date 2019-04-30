package com.example.eventdispatchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ListView;

/**
 * Created by lixiaoye on 2019/4/20.
 */

public class MyListView extends ListView {
    private static final String TAG = "MyListView";

    public MyListView(Context context) {
        this(context, null);
    }

    public MyListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean result = super.onInterceptTouchEvent(ev);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyListView onInterceptTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyListView onInterceptTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyListView onInterceptTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyListView onInterceptTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyListView onInterceptTouchEvent() return " + result);
        return result;

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean result = super.dispatchTouchEvent(ev);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyListView dispatchTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyListView dispatchTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyListView dispatchTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyListView dispatchTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyListView dispatchTouchEvent() return " + result);
        return result;


    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean result = super.onTouchEvent(ev);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyListView onTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyListView onTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyListView onTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyListView onTouchEvent() ACTION_CANCEL");
                break;
        }
        Log.e(TAG, "MyListView onTouchEvent() return " + result);
        return result;
    }
    /**
     *
     *04-22 21:45:36.004 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-22 21:45:36.004 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true
     04-22 21:45:36.028 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-22 21:45:36.028 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() return false
     04-22 21:45:36.028 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_MOVE
     04-22 21:45:36.028 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() return false
     04-22 21:45:36.037 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-22 21:45:36.038 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() return true
     04-22 21:45:36.038 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-22 21:45:36.038 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() return true

     04-22 21:45:36.038 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-22 21:45:36.038 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true

     04-22 21:45:36.060 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-22 21:45:36.060 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() return true

     04-22 21:45:36.060 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_CANCEL
     04-22 21:45:36.060 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() return false

     04-22 21:45:36.066 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_CANCEL
     04-22 21:45:36.066 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() return true

     04-22 21:45:36.066 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_CANCEL
     04-22 21:45:36.066 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() return true

     04-22 21:45:36.066 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-22 21:45:36.066 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true

     04-22 21:45:36.075 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-22 21:45:36.075 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() return true
     */

   /*
    非常重要的日志：
    04-22 21:55:39.646 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_DOWN
04-22 21:55:39.646 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() return false
            04-22 21:55:39.647 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
04-22 21:55:39.647 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() return false
            04-22 21:55:39.661 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_DOWN
04-22 21:55:39.661 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() return true
            04-22 21:55:39.661 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
04-22 21:55:39.661 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() return true
            04-22 21:55:39.662 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_DOWN
04-22 21:55:39.662 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true

            04-22 21:55:39.680 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
04-22 21:55:39.681 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() return false
            04-22 21:55:39.681 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_MOVE
04-22 21:55:39.681 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() return false
            04-22 21:55:39.689 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
04-22 21:55:39.689 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() return true
            04-22 21:55:39.689 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
04-22 21:55:39.689 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() return true
            04-22 21:55:39.689 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
04-22 21:55:39.690 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true
...
            04-22 21:55:40.686 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
04-22 21:55:40.687 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() return true
            04-22 21:55:40.687 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_CANCEL
04-22 21:55:40.687 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() return false
            04-22 21:55:40.696 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_CANCEL
04-22 21:55:40.696 17334-17334/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() return true
            04-22 21:55:40.696 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_CANCEL
04-22 21:55:40.696 17334-17334/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() return true
            04-22 21:55:40.696 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
04-22 21:55:40.697 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true

            04-22 21:55:40.703 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
04-22 21:55:40.703 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() return true
            04-22 21:55:40.703 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
04-22 21:55:40.703 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true
    ...

            04-22 21:55:41.208 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_UP
04-22 21:55:41.208 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() return true
            04-22 21:55:41.208 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_UP
04-22 21:55:41.208 17334-17334/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() return true
*/
}
