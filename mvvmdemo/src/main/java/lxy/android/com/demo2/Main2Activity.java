package lxy.android.com.demo2;

import android.app.Activity;
import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import lxy.android.com.mvvmdemo.R;

public class Main2Activity extends Activity implements View.OnTouchListener {
    private TextView view;
    private WindowManager wm;
    private WindowManager.LayoutParams wmLayoutParams;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        view = findViewById(R.id.view);
        Window window = getWindow();
        wmLayoutParams = window.getAttributes();
//        wm = getWindowManager();
        wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        btn = new Button(this);
        btn.setText("悬浮窗");
        wmLayoutParams = new WindowManager.LayoutParams();
//        wmLayoutParams = new WindowManager.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT,0,0,PixelFormat.TRANSPARENT);
        wmLayoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED;
        wmLayoutParams.gravity = Gravity.LEFT | Gravity.TOP;
        wmLayoutParams.x = 100;
        wmLayoutParams.y = 100;
        wmLayoutParams.width = getResources().getDimensionPixelSize(R.dimen.floating_btn_width);
        wmLayoutParams.height = getResources().getDimensionPixelSize(R.dimen.floating_btn_height);
        wm.addView(btn, wmLayoutParams);
        btn.setOnTouchListener(this);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "点击了我", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                wmLayoutParams.x = rawX;
                wmLayoutParams.y = rawY;
                wm.updateViewLayout(btn, wmLayoutParams);
                break;
            default:
                break;
        }
        return true;
    }
}

