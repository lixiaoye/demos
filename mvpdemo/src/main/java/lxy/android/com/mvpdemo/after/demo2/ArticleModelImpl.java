package lxy.android.com.mvpdemo.after.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * ArticleModelImpl是对数据库的存取操作，
 * 用于保存网络上加载的数据，以及从数据库中加载文章缓存
 */
class ArticleModelImpl implements ArticleModel {
    List<Article> mCachedArticles=new LinkedList<Article>();

}
