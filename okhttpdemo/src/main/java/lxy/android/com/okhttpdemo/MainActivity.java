package lxy.android.com.okhttpdemo;

import android.content.ReceiverCallNotAllowedException;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.w3c.dom.Node;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    public static final MediaType MEDIA_TYPE_MARKDOWN =
            MediaType.parse("text/x-markdown;charset=utf-8");//上传文件类型

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getAsyncHttp();

        new Thread(new Runnable() {
            @Override
            public void run() {
               /* try {
                    final String s = getSyncHttp();//android.os.NetworkOnMainThreadException不要在主线程中访问网络
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();//
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
//                postAsyncHttp();
//                asyncUpload();
//                asyncDownload();
//                sendMultipart();
//                cancelTask();
            }
        }).start();
    }

    /**
     * 异步get请求
     */
    public void getAsyncHttp() {
        //创建OkHttpClient对象
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .method("GET", null)
                .url("https://api.douban.com/v2/book/1220562")
//                .url("https://www.baidu.com")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String s = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
    /**
     * 02-18 14:17:47.900 31088-31171/lxy.android.com.okhttpdemo E/lixiaoye: <!DOCTYPE html>
     <!--STATUS OK--><html> <head><meta http-equiv=content-type content=text/html;charset=utf-8><meta http-equiv=X-UA-Compatible content=IE=Edge><meta content=always name=referrer><link rel=stylesheet type=text/css href=https://ss1.bdstatic.com/5eN1bjq8AAUYm2zgoY3K/r/www/cache/bdorz/baidu.min.css><title>百度一下，你就知道</title></head> <body link=#0000cc> <div id=wrapper> <div id=head> <div class=head_wrapper> <div class=s_form> <div class=s_form_wrapper> <div id=lg> <img hidefocus=true src=//www.baidu.com/img/bd_logo1.png width=270 height=129> </div> <form id=form name=f action=//www.baidu.com/s class=fm> <input type=hidden name=bdorz_come value=1> <input type=hidden name=ie value=utf-8> <input type=hidden name=f value=8> <input type=hidden name=rsv_bp value=1> <input type=hidden name=rsv_idx value=1> <input type=hidden name=tn value=baidu><span class="bg s_ipt_wr"><input id=kw name=wd class=s_ipt value maxlength=255 autocomplete=off autofocus=autofocus></span><span class="bg s_btn_wr"><input type=submit id=su value=百度一下 class="bg s_btn" autofocus></span> </form> </div> </div> <div id=u1> <a href=http://news.baidu.com name=tj_trnews class=mnav>新闻</a> <a href=https://www.hao123.com name=tj_trhao123 class=mnav>hao123</a> <a href=http://map.baidu.com name=tj_trmap class=mnav>地图</a> <a href=http://v.baidu.com name=tj_trvideo class=mnav>视频</a> <a href=http://tieba.baidu.com name=tj_trtieba class=mnav>贴吧</a> <noscript> <a href=http://www.baidu.com/bdorz/login.gif?login&amp;tpl=mn&amp;u=http%3A%2F%2Fwww.baidu.com%2f%3fbdorz_come%3d1 name=tj_login class=lb>登录</a> </noscript> <script>document.write('<a href="http://www.baidu.com/bdorz/login.gif?login&tpl=mn&u='+ encodeURIComponent(window.location.href+ (window.location.search === "" ? "?" : "&")+ "bdorz_come=1")+ '" name="tj_login" class="lb">登录</a>');
     </script> <a href=//www.baidu.com/more/ name=tj_briicon class=bri style="display: block;">更多产品</a> </div> </div> </div> <div id=ftCon> <div id=ftConw> <p id=lh> <a href=http://home.baidu.com>关于百度</a> <a href=http://ir.baidu.com>About Baidu</a> </p> <p id=cp>&copy;2017&nbsp;Baidu&nbsp;<a href=http://www.baidu.com/duty/>使用百度前必读</a>&nbsp; <a href=http://jianyi.baidu.com/ class=cp-feedback>意见反馈</a>&nbsp;京ICP证030173号&nbsp; <img src=//www.baidu.com/img/gs.gif> </p> </div> </div> </div> </body> </html>
     */


    /**
     * 同步GET请求，子线程进行网络请求
     * 主线程中调用报错：Caused by: android.os.NetworkOnMainThreadException
     */
    public String getSyncHttp() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.douban.com/v2/book/1220550")
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }

    /**
     * 异步POST请求
     * OkHttp3异步POST请求和OkHttp2.X有些差别：OkHttp3没有FormEncodingBuilder类，
     * 替代它的是功能更强大的FormBody.
     */
    public void postAsyncHttp() {
        RequestBody formBody = new FormBody.Builder()
                .add("ip", "59.108.54.37")
                .build();
        Request request = new Request.Builder()
                .url("http://ip.taobao.com/service/getIpInfo.php")
                .post(formBody)
                .build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String s = response.body().string();
                Log.e("lixiaoye", s);
            }
        });
    }

    /**
     * 异步文件上传
     */
    public void asyncUpload() {
        String filePath = "";
        //sd卡根目录下okhttp.txt文件
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            filePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            return;
        }
        File file = new File(filePath, "okhttp.txt");
        Request request = new Request.Builder()
//                .url("https://api.github.com/markdown/raw")
                .url("https://www.lixiaoye.top/wp-admin/upload.php")
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN, file))
                .build();
        OkHttpClient client = new OkHttpClient();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("lixiaoye", "onFailure e:" + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("lixiaoye", response.body().string());
            }
        });
/**
 * 02-18 15:31:59.870 20944-20974/lxy.android.com.okhttpdemo E/lixiaoye: onFailure e:/storage/emulated/0/okhttp.txt (Permission denied)
 02-18 15:32:55.383 21277-21309/lxy.android.com.okhttpdemo E/lixiaoye: <p>okhttp
 okhttp
 test</p>
 */
    }


    /**
     * 异步下载文件
     * 下载一张图片，得到Response后将流写进指定的图片文件中
     */
    public void asyncDownload() {
        OkHttpClient okHttpClient = new OkHttpClient();
        String url = "https://www.lixiaoye.top/wp-content/uploads/2019/01/android8.0Activity的启动流程剖析.png";
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                writeToFile(response);
            }
        });
    }

    private void writeToFile(Response response) {
        InputStream inputStream = response.body().byteStream();
        FileOutputStream fileOutputStream = null;
        String filePath = "";
        try {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                filePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            } else {
                filePath = getFilesDir().getAbsolutePath();
            }
            File file = new File(filePath, "activity.jpg");
            if (null != file) {
                fileOutputStream = new FileOutputStream(file);
                byte[] buffer = new byte[2048];
                int len = 0;
                while ((len = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, len);
                }
                fileOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步上传Multipart文件
     */
    private static final MediaType MEDIA_TYPE_PNG = MediaType.parse("image/png");

    /**
     * 异步上传Multipart文件
     */
    public void sendMultipart() {
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("title", "lixiaoye") //常用的key-value形式的参数上传
                .addFormDataPart("image", "a.jpg", RequestBody.create(MEDIA_TYPE_PNG,
                        new File("/sdcard/a.png")))//上传表单
                //addFormDataPart:第一个参数为key值，第二个参数为上传文件的名字；第三个参数是需要上传的文件
                .build();
        Request request = new Request.Builder()
                .header("Authorization", "Client-ID" + "...")
                .url("https://www.lixiaoye.top/image")
                .post(requestBody)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("lixiaoye", "onFailure e:" + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("lixiaoye", response.body().string());
            }
        });
    }

    public void setTimeout() {
        File sdcache = getExternalCacheDir();
        int cacheSize = 10 * 1024 * 1024;
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .cache(new Cache(sdcache.getAbsoluteFile(), cacheSize));
        OkHttpClient okHttpClient = builder.build();
    }

    private ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

    /**
     * 创建定时线程池，100ms后调用call.cancel()取消请求。
     */
    public void cancelTask() {
        OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder()
                .url("https://www.baidu.com")
                .cacheControl(CacheControl.FORCE_NETWORK)//为了让请求耗时，设置每次请求都要请求网络
                .build();
        Call call = null;
        call = client.newCall(request);
        final Call finalCall = call;
        //100ms后取消call
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                finalCall.cancel();
            }
        }, 1, TimeUnit.SECONDS);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (null != response.cacheResponse()) {
                    String s = response.cacheResponse().toString();
                    Log.e("lixiaoye", "cache---" + s);
                } else {
                    String s = response.networkResponse().toString();
                    Log.e("lixiaoye", "network---" + s);
                }
            }
        });
    }
}
































