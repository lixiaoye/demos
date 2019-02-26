package lxy.android.com.mvpdemo.after.demo3.presenter;

/**
 * Created by LIXIAOYE on 2019/2/26.
 */

public interface BasePresenter {
    //    void start();//所有的Presenter的初始化操作都放在start方法中
    void subscribe();

    void unSubscribe();
}
