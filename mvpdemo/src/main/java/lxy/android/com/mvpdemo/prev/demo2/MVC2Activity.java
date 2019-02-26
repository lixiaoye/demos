package lxy.android.com.mvpdemo.prev.demo2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import lxy.android.com.mvpdemo.R;

public class MVC2Activity extends AppCompatActivity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv = new ListView(this);//error:java.lang.SecurityException: Package lxy.android.com.mvpdemo is currently frozen!
        setContentView(R.layout.activity_mvc2);
        //设置视图层
        lv = findViewById(R.id.lv);
        lv.setBackgroundColor(Color.WHITE);

        //获取数据
        String[] data = getResources().getStringArray(R.array.data);

        //数据绑定
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_mvc2_item, R.id.item_tv, data);
        lv.setAdapter(adapter);
    }
    /**
        分析：
     在Android的UI系统中，控制器Activity主要起到的作用就是解耦，将视图View和模型Model进行分离，
     两者在Activity中进行绑定或完成其他逻辑。总体来说，MVC更适合于规模比较大的项目
     Android的UI系统框架是由framework给我们搭建好并提供给我们的。
     */
}
