package design_pattern.structural_pattern.proxy.demo4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * 继承Service组件创建一个BankService子类来表示服务端
 */

public class BankService extends Service{
    /**
     * 重写onBid()方法并返回一个IBinder对象，
     * @param intent
     * @return
     */
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new BankBinder();
    }
}
