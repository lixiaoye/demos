package com.example.aidl_server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.example.service.Book;
import com.example.service.IBookManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaoye on 2019/4/25.
 */

public class BookAidlService extends Service {
    private static final String TAG = "BookService";
    private ArrayList<Book> mBooks;
    private IBinder mBookBinder = new IBookManager.Stub() {
        @Override
        public void addBook(Book book) throws RemoteException {
            synchronized (this){
                if (mBooks==null){
                    mBooks=new ArrayList<>();
                }
                if (book==null){
                    book=new Book(0,"test");
                }
                mBooks.add(book);
//                if (!mBooks.contains(book)) {
//                }
            }
        }

        @Override
        public List<Book> getBookList() throws RemoteException {
            return mBooks;
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBookBinder;
    }
}
