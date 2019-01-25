package lxy.android.com.binderdemo.demo1.client;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import lxy.android.com.binderdemo.R;
import lxy.android.com.binderdemo.demo1.IBookManager;
import lxy.android.com.binderdemo.demo1.bean.Book;
import lxy.android.com.binderdemo.demo1.server.BookService;

public class SecondActivity extends AppCompatActivity {
    private TextView tv;
    private String[] books = {"飘", "月亮与六便士", "刀锋", "傲慢与偏见", "面纱", "百年孤独", "东方快车谋杀案", "无人生还", "abc谋杀案", "人性的枷锁","喜福会"};
    private IBookManager mIBookManager;
    private ServiceConnection mBookConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mIBookManager = IBookManager.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mIBookManager = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.tv);
        Intent intent = new Intent(getApplicationContext(), BookService.class);
        bindService(intent, mBookConnection, BIND_AUTO_CREATE);

    }

    public void clickAddBook(View view) {
        int id = new Random().nextInt(10);
        try {
            mIBookManager.addBook(new Book(id, books[id]));
            tv.setText(mIBookManager.getBookList().toString());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
