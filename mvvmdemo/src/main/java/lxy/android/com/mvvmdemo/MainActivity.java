package lxy.android.com.mvvmdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import lxy.android.com.demo2.Main2Activity;
import lxy.android.com.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("lixiaoye", "female");
        activityMainBinding.setUser(user);

        //如果是给ListView中的Item中的控件赋值
//        ListItemBinding binding=ListItemBinding.infal

    }

    public void click(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
