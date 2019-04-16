package lxy.android.com.glide;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import design_pattern.structural_pattern.bridge.demo2.Image;
import lxy.android.com.reflectdemo.R;

public class FiveActivity extends Activity {
    private LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
//        ImageView iv = new ImageView(this);
        mContainer = findViewById(R.id.container);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        for (int i = 0; i < 100; i++) {
            ImageView image = new ImageView(this);
            mContainer.addView(image);
            Glide.with(this)
                    .load("https://www.lixiaoye.top/wp-content/uploads/2019/03/千年敬祈.png")
                    .into(image);
        }


    }
}
