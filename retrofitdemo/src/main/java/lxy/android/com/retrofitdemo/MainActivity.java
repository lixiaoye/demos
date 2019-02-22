package lxy.android.com.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.apache.http.NameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lxy.android.com.retrofitdemo.bean.User;
import lxy.android.com.retrofitdemo.internet.GitHubHttpServiceProxy;
import lxy.android.com.retrofitdemo.bean.Repo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.PUT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Call<List<Repo>> call = GitHubHttpServiceProxy.getInstance().listRepos("lixiaoye222");
//        Call<List<Repo>> call = GitHubHttpServiceProxy.getInstance().queryRepos("lixiaoye",2,1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("page", 3);
                params.put("per_page", 3);
                Call<List<Repo>> call = GitHubHttpServiceProxy.getInstance().queryRepos2("lixiaoye", params);
                try {
                    Response<List<Repo>> response = call.execute();
                    if (response.code() == 200) {
                        List<Repo> list = response.body();
                        if (list != null && list.size() > 0) {
                            Log.e("lixiaoye", list.toString());
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

//        call.enqueue(new Callback<List<Repo>>() {
//            @Override
//            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
//                Log.i("lixiaoye", "onResponse");
//                if (response.code() == 200) {
//                    List<Repo> list = response.body();
//                    if (list != null && list.size() > 0) {
//                        Log.e("lixiaoye", list.toString());
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Repo>> call, Throwable t) {
//                Log.i("lixiaoye", "onFailure");
//
//            }
//        });
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

    public void clickGetBtn(View view) {
        sendGetRequest();
    }

    /**
     * HttpURLConnection进行get请求
     */
    public void sendGetRequest() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                try {
                    URL url = new URL("https://www.baidu.com");
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    InputStream in = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(in));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    final String res = response.toString();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }
        }).start();
    }
}
