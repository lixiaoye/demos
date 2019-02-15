package lxy.android.com.scrolldemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 跟手滑动View
 * 实现方式：scrollBy(),scrollTo(),移动的是View的内容
 * 实现思想：当触摸view时，系统记下当前触摸点坐标；当手指移动时，系统记下移动后的触摸点坐标，
 * 从而获取到相对于前一次坐标点的偏移量，并通过偏移量来修改view的坐标，
 * 这样不断重复，从而实现滑动过程
 */

public class DragView6 extends View {
    private int mLastX;
    private int mLastY;

    public DragView6(Context context) {
        this(context, null);
    }

    public DragView6(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragView6(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //法二：scrollTo 有问题
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();//绝对坐标：获取触摸点距离屏幕左边界的距离
        int y = (int) event.getY();//绝对坐标：获取触摸点距离屏幕上边界的距离
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mLastX = x;
                mLastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                int deltaX = x - mLastX;
                int deltaY = y - mLastY;
                //法二：scrollTo
                ((View) getParent()).scrollTo(getScrollX()- deltaX, getScrollY() - deltaY);
                break;
        }
        return true;
    }
}
