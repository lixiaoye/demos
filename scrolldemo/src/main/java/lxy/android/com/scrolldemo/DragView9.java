package lxy.android.com.scrolldemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

/**
 * Created by LIXIAOYE on 2019/2/14.
 */

public class DragView9 extends View {
    private Scroller mScroller;

    public DragView9(Context context) {
        this(context, null);
    }

    public DragView9(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragView9(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //初始化Scroller
        mScroller = new Scroller(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                View parent = (View) getParent();
                mScroller.startScroll(parent.getScrollX(), parent.getScrollY(),
                        -parent.getScrollX(), -parent.getScrollY());
                invalidate();//通知View重绘，从而调用computeScroll()方法
                break;
        }
        return true;
    }

    /**
     * 重写computeScroll()方法，实现模拟滑动
     */
    @Override
    public void computeScroll() {
        super.computeScroll();
        //判断Scroller是否完成整个滑动
        if (mScroller.computeScrollOffset()) {
            ((View) getParent()).scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            //通过重绘不断调用computeScroll
            invalidate();
        }
    }
}
