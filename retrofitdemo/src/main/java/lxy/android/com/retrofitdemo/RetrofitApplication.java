package lxy.android.com.retrofitdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by LIXIAOYE on 2019/2/20.
 */

public class RetrofitApplication extends Application {
    private static RetrofitApplication instance;

    public static RetrofitApplication getInstance() {
        return instance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        instance = this;
    }
}
