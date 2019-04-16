package lxy.android.com.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import lxy.android.com.glide.FiveActivity;
import lxy.android.com.reflectdemo.R;

public class FourActivity extends AppCompatActivity {
    private TextView tvMsg;
    private Button btnPost, btnPostSticky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        tvMsg = findViewById(R.id.tv_msg);
        btnPost = findViewById(R.id.btn_post);
        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent("我发送了一条消息!"));
                finish();
            }
        });
        btnPostSticky = findViewById(R.id.btn_post_sticky);
        btnPostSticky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //发送黏性事件
                EventBus.getDefault().postSticky(new MessageEvent("我是一条黏性事件消息"));
                finish();
            }
        });

    }


    public void clickNext(View view) {
        startActivity(new Intent(this, FiveActivity.class));
    }
}
