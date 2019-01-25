package lxy.android.com.binderdemo.demo1.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import lxy.android.com.binderdemo.demo1.IBookManager;
import lxy.android.com.binderdemo.demo1.bean.Book;

/**
 * 服务端进程
 */
public class BookService extends Service {
    private final String TAG = "BookService";
    private ArrayList<Book> mBooks;

    //创建生成本地Binder对象，实现AIDL制定的方法
    private IBinder mIBookBinder = new IBookManager.Stub() {
        @Override
        public List<Book> getBookList() throws RemoteException {
            return mBooks;
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            mBooks.add(book);
        }
    };

    /**
     * 客户端与服务端绑定时的回调，返回mIBookBinder后客户端就可以通过它与远程服务端通信
     * @param intent
     * @return
     */
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        mBooks = new ArrayList<>();
        return mIBookBinder;
    }
}
