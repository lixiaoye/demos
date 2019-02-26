package lxy.android.com.mvpdemo.after.demo3.presenter;


import android.os.Handler;

import io.reactivex.disposables.Disposable;
import lxy.android.com.mvpdemo.after.demo3.contract.UserInfoContract;
import lxy.android.com.mvpdemo.after.demo3.model.UserInfoModel;

/**
 * Presenter持有View和Model的引用
 */

public class UserInfoPresenter implements UserInfoContract.Presenter {
    private UserInfoContract.View view;

    public UserInfoPresenter(UserInfoContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void loadUserInfo() {
        String userId = view.loadUserId();
        view.showLoading();//接口请求前显示loading
        //模拟接口请求回调
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //模拟接口返回的json，并转换为javaBean
                UserInfoModel userInfoModel = new UserInfoModel("茨威格", 200, "奥地利");
                view.showUserInfo(userInfoModel);
                view.dismissLoading();
            }
        }, 3000);
    }

    @Override
    public void subscribe() {
        loadUserInfo();
    }

    @Override
    public void unSubscribe() {
//        disposeIfNeed();
    }

    private void disposeIfNeed(Disposable disposable) {
        if (disposable != null && disposable.isDisposed()) {
            disposable.dispose();
        }
    }
}


















