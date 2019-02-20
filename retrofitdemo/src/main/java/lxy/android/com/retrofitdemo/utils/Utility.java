package lxy.android.com.retrofitdemo.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/**
 * Created by LIXIAOYE on 2019/2/20.
 */

public class Utility {
    public static String getAppMetaData(Context context, String key) {
        if (context == null || TextUtils.isEmpty(key)) {
            return null;
        }
        String val = null;

        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo appInfo = packageManager.getApplicationInfo(context.getPackageName(),
                        PackageManager.GET_META_DATA);
                if (appInfo != null) {
                    if (appInfo.metaData != null) {
                        val = appInfo.metaData.getString(key);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return val;
    }

    public static boolean isDebug(Context context) {
        String channelName = getAppMetaData(context, "channel");
        return "DEBUG".equals(channelName) || TextUtils.isEmpty(channelName);

    }
}
