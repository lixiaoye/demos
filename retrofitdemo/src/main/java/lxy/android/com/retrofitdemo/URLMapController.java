package lxy.android.com.retrofitdemo;

import android.content.Context;

import lxy.android.com.retrofitdemo.utils.Utility;

/**
 * Created by LIXIAOYE on 2019/2/20.
 */

public class URLMapController {
    public static final String HOST = "Https://api.github.com";
    public static final String HOST_TEST = "Https://api.github.com";

    public static String getHost(Context context) {
        return Utility.isDebug(context) ? HOST_TEST : HOST;
    }
}
