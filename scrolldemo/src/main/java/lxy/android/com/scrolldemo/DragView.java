package lxy.android.com.scrolldemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * 跟手滑动View
 * 实现方式：动画方式实现
 * 实现思想：当触摸view时，系统记下当前触摸点坐标；当手指移动时，系统记下移动后的触摸点坐标，
 * 从而获取到相对于前一次坐标点的偏移量，并通过偏移量来修改view的坐标，
 * 这样不断重复，从而实现滑动过程
 * 缺陷：有点生硬卡顿；view本身并未移动，移动的是View的影像！
 * 改进：采用弹性滑动
 */

public class DragView extends View {
    private int mLastX;
    private int mLastY;

    public DragView(Context context) {
        this(context, null);
    }

    public DragView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();//获取手指的当前坐标
        int y = (int) event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                int deltaX = (int) (x - mLastX);//偏移量
                int deltaY = (int) (y - mLastY);
                Log.e("lixiaoye", "move,deltaX:" + deltaX + " deltaY:" + deltaY);
//                float translationX = this.getTranslationX() + deltaX;
//                float translationY = this.getTranslationY() + deltaY;
//                this.setTranslationX(translationX);
//                this.setTranslationY(translationY);
                offsetLeftAndRight(deltaX);//法二
                offsetTopAndBottom(deltaY);//法二
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                break;
        }
        //注意：此处赋值
        mLastX = x;
        mLastY = y;
        return true;
    }
}
