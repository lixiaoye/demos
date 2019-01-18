package lxy.android.com.multiprocess1;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThreeActivity extends AppCompatActivity {
    private static final String TAG = "lixiaoye ThreeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Log.e(TAG, "onCreate");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e(TAG, "onSaveInstanceState2");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.e(TAG, "onRestoreInstanceState2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "onNewIntent");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void click(View view) {
        launchApp();
    }
    public void clickPrev(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }

    private void launchApp() {
        String packName = "lxy.android.com.mutliprocess2";
        PackageManager pm = getPackageManager();
        if (checkPackInfo(packName)) {
            Intent intent = getPackageManager().getLaunchIntentForPackage(packName);
            startActivity(intent);
        } else {
            Toast.makeText(this, "没有安装", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 检查包是否存在
     *
     * @param packName 包名
     * @return true/false
     */
    private boolean checkPackInfo(String packName) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(packName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return packageInfo != null;
    }

    private String fetchPackageName() {
        //获取PackageManager对象
        PackageManager pm = getPackageManager();
        //得到系统安装的所有程序的PackageInfo对象
        List<PackageInfo> packages = pm.getInstalledPackages(0);
        //创建String类型数组，用来存放获取的报名
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < packages.size(); i++) {
            PackageInfo packageInfo = packages.get(i);
            //判断是否是系统级应用
            if ((packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {

            }
        }
        return null;
    }
}
