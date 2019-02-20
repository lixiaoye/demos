package lxy.android.com.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lxy.android.com.retrofitdemo.bean.User;
import lxy.android.com.retrofitdemo.internet.GitHubHttpServiceProxy;
import lxy.android.com.retrofitdemo.bean.Repo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Call<List<Repo>> call = GitHubHttpServiceProxy.getInstance().listRepos("lixiaoye222");
//        Call<List<Repo>> call = GitHubHttpServiceProxy.getInstance().queryRepos("lixiaoye",2,1);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", 3);
        params.put("per_page", 3);
        Call<List<Repo>> call = GitHubHttpServiceProxy.getInstance().queryRepos2("lixiaoye", params);
        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                Log.i("lixiaoye", "onResponse");
                if (response.code() == 200) {
                    List<Repo> list = response.body();
                    if (list != null && list.size() > 0) {
                        Log.e("lixiaoye", list.toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Log.i("lixiaoye", "onFailure");

            }
        });
        Call<User> userCall = GitHubHttpServiceProxy.getInstance().getUserInfo("lixiaoye222");
        userCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.code() == 200) {
                    User user = response.body();
                    Log.e("lixiaoye", user.toString());
                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}
