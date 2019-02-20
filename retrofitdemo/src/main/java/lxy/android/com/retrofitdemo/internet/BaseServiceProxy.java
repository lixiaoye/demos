package lxy.android.com.retrofitdemo.internet;

import java.util.concurrent.TimeUnit;

import lxy.android.com.retrofitdemo.RetrofitApplication;
import lxy.android.com.retrofitdemo.utils.Utility;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LIXIAOYE on 2019/2/20.
 */

public abstract class BaseServiceProxy<T> {
    interface Config {
        boolean DEBUG = false;
        long CONNECT_TIMEOUT = 30;
        long READ_TIMEOUT = 30;
    }

    public OkHttpClient.Builder getDefaultOkHttpBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(Config.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(Config.READ_TIMEOUT, TimeUnit.SECONDS);
        if (Utility.isDebug(RetrofitApplication.getInstance())
                && Config.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(logging);//查看log
        }
        return builder;
    }

    public T buildService(OkHttpClient client,String baseUrl,Class<T> service){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//retrofit原生只支持RxJava1，若使用RxJava2需要添加这个
                .client(client)
                .build()
                .create(service);
    }















}
