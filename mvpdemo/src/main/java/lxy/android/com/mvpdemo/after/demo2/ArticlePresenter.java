package lxy.android.com.mvpdemo.after.demo2;

import java.util.List;

/**
 * Created by LIXIAOYE on 2019/2/25.
 */
//Presenter,作为View和Model的中间人
public class ArticlePresenter {
    //ArticleView接口，代表了View接口角色
    ArticleViewInterface mArticleView;
    //文章数据的Model，也就是Model角色
    ArticleModel model = new ArticleModelImpl();
    //从网络上获取文章的API
    ArticleAPI articleAPI = new ArticleAPIImpl();

    public ArticlePresenter(ArticleViewInterface viewInterface) {
        mArticleView = viewInterface;
    }

    //获取文章，也就是我们的业务逻辑
    public void fetchArticles() {
        mArticleView.showLoading();
//        articleAPI.fetchArticles(new DataListener<List<Article>>)
    }
}
