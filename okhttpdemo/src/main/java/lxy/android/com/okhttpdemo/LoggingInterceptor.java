package lxy.android.com.okhttpdemo;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by LIXIAOYE on 2019/2/19.
 */

public class LoggingInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long t1 = System.nanoTime();
        Response response = chain.proceed(request);
        long t2 = System.nanoTime();
        return response;
    }
}
