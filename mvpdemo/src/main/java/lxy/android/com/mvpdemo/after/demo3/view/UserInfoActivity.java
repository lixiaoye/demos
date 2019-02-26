package lxy.android.com.mvpdemo.after.demo3.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import lxy.android.com.mvpdemo.R;
import lxy.android.com.mvpdemo.after.demo3.contract.UserInfoContract;
import lxy.android.com.mvpdemo.after.demo3.model.UserInfoModel;
import lxy.android.com.mvpdemo.after.demo3.presenter.UserInfoPresenter;

public class UserInfoActivity extends AppCompatActivity implements UserInfoContract.View {
    private TextView tv_name;
    private TextView tv_age;
    private TextView tv_country;
    private UserInfoContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        tv_name = findViewById(R.id.tv_name);
        tv_age = findViewById(R.id.tv_age);
        tv_country = findViewById(R.id.tv_country);
        new UserInfoPresenter(this);
        /**
         *此处写成了new UserInfoPresenter(this);而不是presenter = new UserInfoPresenter(this);
         * 因为UserInfoActivity实现了UserInfoContract.View中的setPresenter()方法；
         * 而UserInfoPresenter构造函数中已经调用过了UserInfoContract.View中的setPresenter()方法；
         * 两者思想一样，只是写法不同；
         */
        presenter.subscribe();
    }

    @Override
    public void setPresenter(UserInfoContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "正在加载", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void dismissLoading() {
        Toast.makeText(this, "加载完成", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserInfo(UserInfoModel userInfoModel) {
        if (userInfoModel != null) {
            tv_name.setText(userInfoModel.getName());
            //int需要转String，否则报错：android.content.res.Resources$NotFoundException: String resource ID #0xc8
            tv_age.setText(String.valueOf(userInfoModel.getAge()));
            tv_country.setText(userInfoModel.getCountry());
        }
    }

    @Override
    public String loadUserId() {
        return "10001";
    }
}
