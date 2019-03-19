package com.example.waveview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by lixiaoye on 2019/3/16.
 */

public class WaveView extends View {
    private static final String TAG = "WaveView";
    private final Paint mPaint = new Paint();
    private final Path mFirstPath = new Path();
    private final Path mSecondPath = new Path();
    /**
     * 两条正弦波之间的波，振幅比较低的那一条
     */
    private final Path mCenterPath = new Path();
    /**
     * 采样点的数量，越高越精细，但高于一定限度后人眼察觉不出来
     */
    private static final int SAMPLINT_SIZE = 128;//64也识别不出来
    private float[] mSamplingX;//采样点
    private float[] mMapx;//映射点的集合
    private int mWidth;
    private int mHeight;
    private int mCenterHeight;
    private int mAmplitude;//振幅
    /**
     * 波峰和两条路径交叉点的记录，包括起点和终点，用于绘制渐变
     */
    private final float[][] mCrestAndCrossPints = new float[9][];
    private final RectF rectF = new RectF();
    private final Xfermode mXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    private final int mBackgroundColor = Color.rgb(24, 33, 41);
    private final int mCenterPathColor = Color.argb(64, 255, 255, 255);


    long startTime = System.currentTimeMillis();//时间做动画用，当前时间

    public WaveView(Context context) {
        this(context, null);
    }

    public WaveView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WaveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint.setDither(true);//防抖动
        mPaint.setAntiAlias(true);//抗锯齿
        for (int i = 0; i < 9; i++) {
            mCrestAndCrossPints[i] = new float[2];
        }
    }


    /**
     * 设置触发事件，继续调用onDraw方法
     */
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            invalidate();

        }
    };

    @Override
    protected void onDraw(Canvas canvas) {
        if (mSamplingX == null) {//第一帧时进行采样，第二帧过来不需要采样
            //采样点为空，则计算采样点
            mWidth = canvas.getWidth();
            mHeight = canvas.getHeight();

            mCenterHeight = mHeight == 0 ? 50 : mHeight >> 1;//高/2
            mAmplitude = mWidth == 0 ? 30 : mWidth >> 3;//宽/8

            mSamplingX = new float[SAMPLINT_SIZE + 1];//128+起始位置采样点
            mMapx = new float[SAMPLINT_SIZE + 1];

            float gap = mWidth / (float) SAMPLINT_SIZE;
            float x;
            for (int i = 0; i < SAMPLINT_SIZE; i++) {
                x = i * gap;
                mSamplingX[i] = x;
                mMapx[i] = (x / (float) mWidth) * 4 - 2;//映射到[-2,2]
            }//至此线的图层已经绘制完成

        }

        canvas.drawColor(Color.rgb(24, 33, 41));
        //Path来划线的第一步操作，初始化，
        mFirstPath.rewind();//相位初始化
        mSecondPath.rewind();
        mCenterPath.rewind();//因为android的onDraw()方法每一帧都会调用，所以每一帧在画线时都需要复位

        mFirstPath.moveTo(0, mCenterHeight);
        mSecondPath.moveTo(0, mCenterHeight);
        mCenterPath.moveTo(0, mCenterHeight);

        float offset = (System.currentTimeMillis() - startTime) / 500f;//500可调 动画

        float x;
        float curV = 0;
        for (int i = 0; i <= SAMPLINT_SIZE; i++) {
            x = mSamplingX[i];
            curV = i < SAMPLINT_SIZE ? (float) (mAmplitude * calculate(mMapx[i], offset)) : 0;//y轴坐标

            mFirstPath.lineTo(x, mCenterHeight + curV);
            mSecondPath.lineTo(x, mCenterHeight - curV);
            mCenterPath.lineTo(x, mCenterHeight + curV / 5);
        }

        //接下来完成渐变填充
        //正方形里
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(1);//线条宽度为1


        canvas.drawPath(mFirstPath, mPaint);
        canvas.drawPath(mSecondPath, mPaint);
        canvas.drawPath(mCenterPath, mPaint);
        //绘制完，将图层缓存
        int saveCount = canvas.saveLayer(0, 0, mWidth, mHeight, null, Canvas.ALL_SAVE_FLAG);//离屏缓存保存起来

        //设置画笔颜色来绘制矩形，然后叠加
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        mPaint.setXfermode(mXfermode);//当此图层与之前缓存下来的图层叠加时显示方式
        mPaint.setShader(new LinearGradient(0,mCenterHeight + mAmplitude, 0, mCenterHeight - mAmplitude,
                Color.BLUE, Color.GREEN, Shader.TileMode.CLAMP));//画笔里设置的渲染的阴影的渐变颜色范围

        //设置矩形边框，最外面整个矩形
        rectF.set(0, mCenterHeight+mAmplitude , mWidth,mCenterHeight-mAmplitude);

        canvas.drawRect(rectF, mPaint);//绘制渐变矩形

        /*//填充上下两条正弦函数
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(1);
        canvas.drawPath(mFirstPath, mPaint);
        canvas.drawPath(mSecondPath, mPaint);

        //绘制渐变
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setXfermode(mXfermode);
        float startX, crestY, endX;
        int crestAndCrossCount=11;
        for (int i = 0; i < crestAndCrossCount; i += 2) {
            //每隔两个点可绘制一个矩形，这里先计算矩形的参数
            startX = mCrestAndCrossPints[i - 2][0];
            crestY = mCrestAndCrossPints[i - 1][1];
            endX = mCrestAndCrossPints[i][0];
            //crest有正有负，无需计算渐变是从上到下还是从下到上
            mPaint.setShader(new LinearGradient(0, mCenterHeight + crestY, 0, mCenterHeight - crestY,
                    Color.BLUE, Color.GREEN, Shader.TileMode.CLAMP));
            rectF.set(startX, mCenterHeight + crestY, endX, mCenterHeight - crestY);
            canvas.drawRect(rectF, mPaint);

        }
*/

        //画完矩形后，将shader恢复
//        mPaint.setShader(null);//去掉此句，否则效果不对！
        mPaint.setXfermode(null);
//        //叠加
        canvas.restoreToCount(saveCount);

        mPaint.setStyle(Paint.Style.STROKE);//每条path类的线需要描边
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(3);//线条宽度3px

        canvas.drawPath(mFirstPath, mPaint);
        canvas.drawPath(mSecondPath, mPaint);
        mPaint.setColor(Color.CYAN);//中心线的颜色换一下
        canvas.drawPath(mCenterPath, mPaint); //描边可以和画线绘制成一个

        //发消息
        mHandler.sendEmptyMessageDelayed(0, 16);//每秒60帧的频率去刷新
    }

    private double calculate(float mapX, float offset) {
        offset %= 2;
        double sinFunx = Math.sin(0.75 * Math.PI * mapX - offset * Math.PI);
        double recessionFun = Math.pow(4 / (4 + Math.pow(mapX, 4)), 2.5);//筛选函数
        return sinFunx * recessionFun;//得到y坐标
    }

    @Override
    protected void onDetachedFromWindow() {
        mHandler.removeCallbacks(null);
        super.onDetachedFromWindow();
    }
}
