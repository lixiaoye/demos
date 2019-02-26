package lxy.android.com.mvpdemo.after.demo3.contract;

import lxy.android.com.mvpdemo.after.demo3.presenter.BasePresenter;
import lxy.android.com.mvpdemo.after.demo3.BaseView;
import lxy.android.com.mvpdemo.after.demo3.model.UserInfoModel;

/**
 * 契约类内部有两个接口，分别继承了BaseView和BasePresenter，
 * View和Presenter中实现的方法分别是UI操作，和数据业务逻辑操作。
 */
//
public interface UserInfoContract {
    interface View extends BaseView<Presenter> {
        void showLoading();//展示加载框

        void dismissLoading();//取消加载框展示

        void showUserInfo(UserInfoModel userInfoModel);//将网络请求得到的用户信息回调

        String loadUserId();
    }

    interface Presenter extends BasePresenter {
        void loadUserInfo();
    }
}
