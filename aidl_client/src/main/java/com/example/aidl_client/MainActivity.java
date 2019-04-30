package com.example.aidl_client;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.service.Book;
import com.example.service.IBookManager;

import java.util.List;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    private IBookManager iBookManager;

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        bindService();
    }

    /**
     * 添加书籍
     *
     * @param view
     */
    public void clickBtn(View view) {
        try {
            if (iBookManager!=null){
                iBookManager.addBook(new Book(1, "百年孤独"));
                List<Book> books = iBookManager.getBookList();
                tv.setText(books.toString());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void bindService() {
        Intent intent = new Intent();
        intent.setAction("com.example.aidl");
        intent.setPackage("com.example.aidl_server");
//        intent.setComponent(new ComponentName("com.example.aidl_server", "com.example.aidl_server.BookService"));
        bindService(intent, connection, Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.e(TAG, "onServiceConnected:success");
            iBookManager = IBookManager.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e(TAG, "onServiceDisconnected:success");
            iBookManager = null;
        }
    };

    @Override
    protected void onDestroy() {
        unbindService(connection);
        super.onDestroy();
    }
}
