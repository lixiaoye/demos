package lxy.android.com.binderdemo.demo2.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import lxy.android.com.binderdemo.demo2.IPersonManager;
import lxy.android.com.binderdemo.demo2.bean.Person;

/**
 * 服务端实现了接口，并在onBind()方法中返回这个Binder
 */
public class PersonService extends Service {

    private final String TAG = "PersonService";
    private ArrayList<Person> mPersonList;

    /**
     * 创建生成的本地Binder对象，实现AIDL制定的方法
     */
    private IBinder mIPersonBinder = new IPersonManager.Stub() {
        @Override
        public void addPerson(Person person) throws RemoteException {
            mPersonList.add(person);
        }

        @Override
        public List<Person> getPersonList() throws RemoteException {
            return mPersonList;
        }
    };

    /**
     * 客户端与服务端绑定时的回调，返回mIBinder后客户端就可以通过它
     * 远程调用服务端的方法，即实现了跨进程通信
     *
     * @param intent
     * @return
     */
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        mPersonList = new ArrayList<>();
        return mIPersonBinder;
    }
}
