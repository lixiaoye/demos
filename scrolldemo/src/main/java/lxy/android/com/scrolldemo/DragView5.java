package lxy.android.com.scrolldemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/**
 * 跟手滑动View
 * 实现方式：scrollBy(),scrollTo(),
 * 如果在View中使用，那么滑动的是View的内容；在ViewGroup中使用，滑动的是其所有子View。
 * 实现思想：当触摸view时，系统记下当前触摸点坐标；当手指移动时，系统记下移动后的触摸点坐标，
 * 从而获取到相对于前一次坐标点的偏移量，并通过偏移量来修改view的坐标，
 * 这样不断重复，从而实现滑动过程
 */

public class DragView5 extends View {
    private int mLastX;
    private int mLastY;

    public DragView5(Context context) {
        this(context, null);
    }

    public DragView5(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragView5(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //法一：scrollBy ok
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mLastX = x;
                mLastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                //计算偏移量
                int deltaX = x - mLastX;//偏移量
                int deltaY = y - mLastY;
                //法一：scrollBy
                ((View) getParent()).scrollBy(-deltaX, -deltaY);
                break;
        }
        return true;
    }


}
