package lxy.android.com.scrolldemo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * 跟手滑动View
 * 实现方式：LayoutParams,前提：必须有一个父布局，否则系统无法获取LayoutParams！
 * 实现思想：当触摸view时，系统记下当前触摸点坐标；当手指移动时，系统记下移动后的触摸点坐标，
 * 从而获取到相对于前一次坐标点的偏移量，并通过偏移量来修改view的坐标，
 * 这样不断重复，从而实现滑动过程
 */

public class DragView4 extends View {
    private int mLastX;
    private int mLastY;

    public DragView4(Context context) {
        this(context, null);
    }

    public DragView4(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragView4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();//绝对坐标：获取触摸点距离屏幕左边界的距离
        int y = (int) event.getRawY();//绝对坐标：获取触摸点距离屏幕上边界的距离
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                //计算偏移量
                int deltaX = x - mLastX;//偏移量
                int deltaY = y - mLastY;
                //法一：
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) this.getLayoutParams();
                lp.leftMargin = getLeft() + deltaX;
                lp.topMargin = getTop() + deltaY;
                setLayoutParams(lp);
                //法二：
            /*ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.getLayoutParams();
            marginLayoutParams.leftMargin = getLeft() + deltaX;
            marginLayoutParams.topMargin = getTop() + deltaY;
            setLayoutParams(marginLayoutParams);*/
                break;
        }
        mLastX = x;
        mLastY = y;
        return true;
    }
}
