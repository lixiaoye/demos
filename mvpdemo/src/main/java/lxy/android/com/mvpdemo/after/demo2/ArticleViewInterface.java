package lxy.android.com.mvpdemo.after.demo2;

import java.util.List;

/**
 * ArtuckeViewInterface是主界面的逻辑接口，代表了View接口角色，
 * 用于Presenter回调View的操作。
 */
public interface ArticleViewInterface {
    public void showArticles(List<Article> articles);//展示数据

    public void showLoading();//显示进度条

    public void hideLoading();//隐藏进度条
}
