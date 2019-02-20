package lxy.android.com.retrofitdemo.internet;

import java.util.List;
import java.util.Map;

import lxy.android.com.retrofitdemo.RetrofitApplication;
import lxy.android.com.retrofitdemo.URLMapController;
import lxy.android.com.retrofitdemo.bean.Repo;
import lxy.android.com.retrofitdemo.bean.User;
import okhttp3.OkHttpClient;
import retrofit2.Call;

/**
 * Created by LIXIAOYE on 2019/2/20.
 */
//静态内部类实现单例
public class GitHubHttpServiceProxy extends BaseServiceProxy<GitHubService> {
    private static final String TAG = "HttpService";
    private final GitHubService mService;

    private GitHubHttpServiceProxy(String url) {
        OkHttpClient.Builder builder = getDefaultOkHttpBuilder();
        mService = buildService(builder.build(), url, GitHubService.class);
    }

    private static class Holder {
        private static final GitHubHttpServiceProxy proxy = new GitHubHttpServiceProxy(
                URLMapController.getHost(RetrofitApplication.getInstance()));
    }

    public static GitHubHttpServiceProxy getInstance() {
        return Holder.proxy;
    }

    public Call<User> getUserInfo(String userName) {
        return mService.getUserInfo(userName);
    }


    public Call<List<Repo>> listRepos(String user) {
        return mService.listRepos(user);
    }

    public Call<List<Repo>> queryRepos(String user, int page, int count) {
        return mService.queryRepos(user, page, count);
    }

    public Call<List<Repo>> queryRepos2(String user, Map<String, Object> params) {
        return mService.queryRepos2(user, params);
    }


}
