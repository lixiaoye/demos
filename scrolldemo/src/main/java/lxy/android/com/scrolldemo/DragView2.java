package lxy.android.com.scrolldemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * 跟手滑动View
 * 实现方式：getX()相对坐标获取偏移量 layout(left,top,right,bottom)
 * 实现思想：当触摸view时，系统记下当前触摸点坐标；当手指移动时，系统记下移动后的触摸点坐标，
 * 从而获取到相对于前一次坐标点的偏移量，并通过偏移量来修改view的坐标，
 * 这样不断重复，从而实现滑动过程
 * 缺陷：有点生硬卡顿
 * 改进：采用弹性滑动
 */

public class DragView2 extends View {
    private int mLastX;
    private int mLastY;

    public DragView2(Context context) {
        this(context, null);
    }

    public DragView2(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();//相对坐标：获取触摸点距离view左边界的距离
        int y = (int) event.getY();//相对坐标：获取触摸点距离view上边界的距离
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //手指按下时记录触摸点的坐标
                mLastX = x;
                mLastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                //计算偏移量
                int deltaX = x - mLastX;//偏移量
                int deltaY = y - mLastY;
                //在当前left,top,right,bottom的基础上，计算增加出来的偏移量
                layout(getLeft() + deltaX, getTop() + deltaY, getRight() + deltaX, getBottom() + deltaY);
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                break;
        }
        return true;
    }
}
