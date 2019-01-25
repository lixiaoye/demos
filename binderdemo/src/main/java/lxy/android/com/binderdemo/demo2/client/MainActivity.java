package lxy.android.com.binderdemo.demo2.client;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

import lxy.android.com.binderdemo.R;
import lxy.android.com.binderdemo.demo1.client.SecondActivity;
import lxy.android.com.binderdemo.demo2.server.PersonService;
import lxy.android.com.binderdemo.demo2.IPersonManager;
import lxy.android.com.binderdemo.demo2.bean.Person;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private IPersonManager mPersonManager;
    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //链接后拿到Binder，转换为AIDL，在不同的进程返回这个代理
            mPersonManager = IPersonManager.Stub.asInterface(service);
            //IPersonManager.Stub.asInterface()方法将Binder转为aidl类
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mPersonManager = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(getApplicationContext(), PersonService.class);
        bindService(intent, mConnection, BIND_AUTO_CREATE);//要执行IPC必须将bindService()将应用绑定到服务上
        tv = findViewById(R.id.tv);
    }

    /**
     * 点击添加人员
     *
     * @param view
     */
    public void click(View view) {
        int id = new Random().nextInt(10);
        Person person = new Person(id, "lee" + id);
        try {
            mPersonManager.addPerson(person);
            List<Person> personList = mPersonManager.getPersonList();
            tv.setText(personList.toString());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void clickNext(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
