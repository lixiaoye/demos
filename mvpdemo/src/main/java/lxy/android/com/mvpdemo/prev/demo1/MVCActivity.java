package lxy.android.com.mvpdemo.prev.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import lxy.android.com.mvpdemo.R;
import lxy.android.com.mvpdemo.after.demo1.MVPActivity;
import lxy.android.com.mvpdemo.prev.demo2.MVC2Activity;

public class MVCActivity extends AppCompatActivity {

    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
    }

    public void click(View view) {
        new HttpModel(tv).request();
    }

    public void clickNext(View view) {
        startActivity(new Intent(this, MVPActivity.class));
    }
    public void clickPrev(View view) {
        startActivity(new Intent(this, MVC2Activity.class));
    }
}
