package lxy.android.com.mvpdemo.after;

import android.app.Presentation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import lxy.android.com.mvpdemo.R;

public class MVPActivity extends AppCompatActivity implements MVPView {
    private TextView tv;
    private Button btn;
    private MVPPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);

        presenter = new MVPPresenter(this);
    }

    //点击按钮请求网络以获取数据
    public void click(View view) {
        //通知Presenter请求
        presenter.request();
    }

    //获取到数据后更新textview
    @Override
    public void updateTextView(String msg) {
        tv.setText(msg);
    }

    /**
     * 当Activity退出后，Model中请求数据没有意义了，
     * 所以应该在detachView中把Handler的任务取消，
     * 避免造成资源浪费
     */
    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }
}
