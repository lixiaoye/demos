package lxy.android.com.retrofitdemo.internet;


import java.util.List;
import java.util.Map;

import lxy.android.com.retrofitdemo.bean.Repo;
import lxy.android.com.retrofitdemo.bean.Result;
import lxy.android.com.retrofitdemo.bean.User;
import lxy.android.com.retrofitdemo.bean.WeChatLoginResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by LIXIAOYE on 2019/2/20.
 */

public interface GitHubService {


    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String userName);//https://api.github.com/users/lixiaoye222/repos

    @GET("users/{user}/repos")
    Call<List<Repo>> queryRepos(@Path("user") String userName, @Query("page") int page, @Query("per_page") int count);
    //https://api.github.com/users/lixiaoye/repos?page=2&per_page=1

    @GET("users/{user}/repos")
    Call<List<Repo>> queryRepos2(@Path("user") String userName, @QueryMap Map<String, Object> params);
    //https://api.github.com/users/lixiaoye/repos?page=3&per_page=3

    @GET("users/{username}")
    Call<User> getUserInfo(@Path("username") String userName);
    //https://api.github.com/users/lixiaoye222

    /**
     * 调用foo.example("Bob Smith","President")
     * url为https://xxx.xxx.com?name=Bob+Smith&occupation=President
     */
    @FormUrlEncoded
    @POST("/")
    Call<ResponseBody> example1(@Field("name") String name, @Field("occupation") String occupation);

    /**
     * 调用foo.example("Bob Smith","Jane Doe")
     * url为https://xxx.xxx.com/list?name=Bob+Smith&name=Jane+Doe
     */
    @FormUrlEncoded
    @POST("/list")
    Call<ResponseBody> example2(@Field("name") String... names);

    /**
     * 调用foo.things(ImmutableMap.of("foo","bar","kit","kat"))
     * 则url为https://xxx.xxx.com/things?foo=bar&kit=kat
     */
    @FormUrlEncoded
    @POST("/things")
    Call<ResponseBody> things(@FieldMap Map<String,String> fields);

    @POST("/calendar-v2/wechat/login")
    void loginWithWechat(@Body String code, @QueryMap Map<String, Object> data, Callback<Result<WeChatLoginResponse>> cb);
//    https://xxx.xxx.cn/calendar-v2/wechat/login?sign=xxx&time=1550659887248&code=xxx&client=1&clientVersion=1.7.9&uuid=androidxxx

/*    // 创建 RequestBody，用于封装构建RequestBody
    RequestBody requestFile =
            RequestBody.create(MediaType.parse("multipart/form-data"), file);
    // MultipartBody.Part  和后端约定好Key，这里的partName是用image
    MultipartBody.Part body =
            MultipartBody.Part.createFormData("image", file.getName(), requestFile);*/

    /*@Header()
    @Headers()
    @HeaderMap*/


    @GET("/friends")
    Call<ResponseBody> friends(@Query("group") String group);
    /*
     * 调用foo.friends(null),
     * 则url为https://xxx.xxx.com/xx/xx/friends
     */


    @GET("/friends")
    Call<ResponseBody> friends(@Query("group") String... group);
    /*
     * 调用foo.friends("coworker","bowling")，
     * 则url为https://xxx.xxx.com/xx/xx/friends?group=coworker&group=bowling
     */


    @GET("/friends")
    Call<ResponseBody> friends2(@Query(value = "group", encoded = true) String group);
/*
 * 调用foo.friends("foo+bar")，
 * 则url为https://xxx.xxx.com/xx/xx/friends?group=foo+bar
 */
    /**
     * 调用foo.friends(ImmutableMap.of("group","coworker","age","42")),
     则url为https://xxx.xxx.com/xx/xx/friends?group=coworker&age=42
     */
    @GET("/friends")
    Call<ResponseBody> friends(@QueryMap Map<String,String> filters);

    /**
     * 调用foo.friends(ImmutableMap.of("group","coworker+bowling")),
     则url为https://xxx.xxx.com/xx/xx/friends?group=coworker+bowling
     */
    @GET("/friends")
    Call<ResponseBody> friends2(@QueryMap(encoded = true) Map<String,String> filters);




    /**
     * 网络请求方法：
     @GET
     @POST
     @PUT
     @DELETE
     @PATCH
     @OPTIONS
     @HTTP
     @HEAD
      * 标记类
     @Multipart
     @FormUrlEncoded
     @Streaming
      * 网络请求参数
     @Url
     @Header()
     @Headers()
     @HeaderMap
     @Path()
     @Query
     @QueryMap
     @Field
     @FieldMap
     @Body
     @Part
     @PartMap
     */


}
