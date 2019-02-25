package lxy.android.com.rxjavademo;

import android.os.HardwarePropertiesManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.reactivestreams.Subscriber;

import java.net.ResponseCache;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click1(View view) {
        //法二：链式调用
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
        /*//1.创建被观察者
        Observable observable = Observable.create(new ObservableOnSubscribe() {
            @Override
            public void subscribe(ObservableEmitter emitter) throws Exception {
                Log.e("lixiaoye", "current thread name:" + Thread.currentThread().getName());
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        });
        //2.创建观察者
        Observer observer = new Observer<Integer>() {

            @Override
            public void onSubscribe(Disposable d) {
                Log.e("lixiaoye", "onSubscrible");
            }

            @Override
            public void onNext(Integer integer) {
                Log.e("lixiaoye", "onNext " + integer);

            }

            @Override
            public void onError(Throwable e) {
                Log.e("lixiaoye", "onError");

            }

            @Override
            public void onComplete() {
                Log.e("lixiaoye", "onComplete");

            }
        };
        //3.订阅
        observable.subscribe(observer);
        *//**
         * 02-24 15:11:23.219 11159-11159/lxy.android.com.rxjavademo E/lixiaoye: onSubscrible
         02-24 15:11:23.219 11159-11159/lxy.android.com.rxjavademo E/lixiaoye: current thread name:main
         02-24 15:11:23.219 11159-11159/lxy.android.com.rxjavademo E/lixiaoye: onNext 1
         02-24 15:11:23.219 11159-11159/lxy.android.com.rxjavademo E/lixiaoye: onNext 2
         02-24 15:11:23.219 11159-11159/lxy.android.com.rxjavademo E/lixiaoye: onNext 3
         02-24 15:11:23.219 11159-11159/lxy.android.com.rxjavademo E/lixiaoye: onComplete
         *//*
*/
    }

    public void click2(View view) {
        Observable.create(new ObservableOnSubscribe<Integer>() {//1.初始化Observable
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                Log.e("lixiaoye", "Observable emit 1 \n");
                emitter.onNext(1);
                Log.e("lixiaoye", "Observable emit 2 \n");
                emitter.onNext(2);
                Log.e("lixiaoye", "Observable emit 3 \n");
                emitter.onNext(3);
                emitter.onComplete();
                Log.e("lixiaoye", "Observable emit 4 \n");
                emitter.onNext(4);
            }
        }).subscribe(new Observer<Integer>() {//3.订阅
            //2.初始化Observer
            private int i;
            private Disposable disposable;

            @Override
            public void onSubscribe(@NonNull Disposable d) {
                disposable = d;

            }

            @Override
            public void onNext(Integer integer) {
                i++;
                Log.e("lixiaoye", "onNext " + i);
                if (i == 2) {
                    //rxjava2.x新增的Disposable可以做到切断的操作，让Observer观察者不再接收上游事件
                    disposable.dispose();
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.e("lixiaoye", "onError：value" + e.getMessage() + "\n");
            }

            @Override
            public void onComplete() {
                Log.e("lixiaoye", "onComplete \n");
            }
        });
        /**
         * 打印结果：
         * 02-24 13:15:50.406 10746-10746/lxy.android.com.rxjavademo E/lixiaoye: Observable emit 1
         02-24 13:15:50.406 10746-10746/lxy.android.com.rxjavademo E/lixiaoye: onNext 0
         02-24 13:15:50.406 10746-10746/lxy.android.com.rxjavademo E/lixiaoye: Observable emit 2
         02-24 13:15:50.406 10746-10746/lxy.android.com.rxjavademo E/lixiaoye: onNext 1
         02-24 13:15:50.406 10746-10746/lxy.android.com.rxjavademo E/lixiaoye: Observable emit 3
         02-24 13:15:50.407 10746-10746/lxy.android.com.rxjavademo E/lixiaoye: Observable emit 4
         */
    }

    public void click3(View view) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                Log.e("lixiaoye", "Observable thread is:" + Thread.currentThread().getName());//RxNewThreadScheduler-1
                emitter.onNext(1);
                emitter.onComplete();
            }
        }).subscribeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        Log.e("lixiaoye", "after observeOn(mainThread),Current thread is "
                                + Thread.currentThread().getName());//main
                    }
                }).observeOn(Schedulers.io())
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        Log.e("lixiaoye", "After observeOn(io),Current thread is:"
                                + Thread.currentThread().getName());//RxCachedThreadScheduler-2
                    }
                });
        /**
         * 打印结果：
         * 02-24 13:42:49.428 25873-25959/lxy.android.com.rxjavademo E/lixiaoye: Observable thread is:RxNewThreadScheduler-1
         02-24 13:42:49.429 25873-25873/lxy.android.com.rxjavademo E/lixiaoye: after observeOn(mainThread),Current thread is main
         02-24 13:42:49.430 25873-25960/lxy.android.com.rxjavademo E/lixiaoye: After observeOn(io),Current thread is:RxCachedThreadScheduler-2
         */
    }

    public void click4(View view) {
      /*  Flowable.fromArray(1,2,3,4,5)
                .subscribe(integer->Log.e("lixiaoye",String.valueOf(integer)));
        */
        /**
         * 02-24 16:00:42.705 6802-6802/lxy.android.com.rxjavademo E/lixiaoye: 1
         02-24 16:00:42.705 6802-6802/lxy.android.com.rxjavademo E/lixiaoye: 2
         02-24 16:00:42.705 6802-6802/lxy.android.com.rxjavademo E/lixiaoye: 3
         02-24 16:00:42.705 6802-6802/lxy.android.com.rxjavademo E/lixiaoye: 4
         02-24 16:00:42.705 6802-6802/lxy.android.com.rxjavademo E/lixiaoye: 5
         */


       /* Flowable.just("test1", "test2","test3",
                "test4","test5","test6","test7","test8","test9","test10")
                .subscribe(str -> Log.e("lixiaoye", str));*/
        /**
         02-24 16:29:45.133 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test1
         02-24 16:29:45.133 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test2
         02-24 16:29:45.133 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test3
         02-24 16:29:45.134 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test4
         02-24 16:29:45.134 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test5
         02-24 16:29:45.134 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test6
         02-24 16:29:45.134 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test7
         02-24 16:29:45.134 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test8
         02-24 16:29:45.134 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test9
         02-24 16:29:45.134 23928-23928/lxy.android.com.rxjavademo E/lixiaoye: test10
         */

        /*Single.just("single 1")
                .subscribe(str -> Log.e("lixiaoye", str));*/
        //02-24 16:23:58.249 20869-20869/lxy.android.com.rxjavademo E/lixiaoye: single 1

        /* Maybe.just("maybe 1")
                .subscribe(str -> Log.e("lixiaoye", str));*/
        //02-24 16:23:58.250 20869-20869/lxy.android.com.rxjavademo E/lixiaoye: maybe 1


        /*List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Flowable.fromIterable(list)
                .subscribe(s -> Log.e("lixiaoye", s));*/
        /**
         02-24 16:37:00.673 28008-28008/lxy.android.com.rxjavademo E/lixiaoye: a
         02-24 16:37:00.673 28008-28008/lxy.android.com.rxjavademo E/lixiaoye: b
         02-24 16:37:00.673 28008-28008/lxy.android.com.rxjavademo E/lixiaoye: c
         */

//        Flowable.timer(1, TimeUnit.SECONDS)
//                .subscribe(x -> Log.e("lixiaoye", String.valueOf(x)));
////        02-24 16:51:36.502 4961-5062/lxy.android.com.rxjavademo E/lixiaoye: 0


      /*  Flowable.interval(2, 1, TimeUnit.SECONDS)
                .subscribe(x -> Log.e("lixiaoye", String.valueOf(x)));*/
        /**
         * 2秒后开始执行，以后每隔1秒打印一次
         * 02-24 16:48:34.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 0
         02-24 16:48:35.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 1
         02-24 16:48:36.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 2
         02-24 16:48:37.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 3
         02-24 16:48:38.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 4
         02-24 16:48:39.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 5
         02-24 16:48:40.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 6
         02-24 16:48:41.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 7
         02-24 16:48:42.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 8
         02-24 16:48:43.765 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 9
         02-24 16:48:44.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 10
         02-24 16:48:45.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 11
         02-24 16:48:46.764 2415-2937/lxy.android.com.rxjavademo E/lixiaoye: 12
         */
    }

    public void click5(View view) {

        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        }).map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception {
                return "This is result " + integer;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.e("lixiaoye", s);
            }
        });
        /**
         * 02-24 16:58:11.250 8964-8964/lxy.android.com.rxjavademo E/lixiaoye: This is result 1
         02-24 16:58:11.251 8964-8964/lxy.android.com.rxjavademo E/lixiaoye: This is result 2
         02-24 16:58:11.251 8964-8964/lxy.android.com.rxjavademo E/lixiaoye: This is result 3
         */
    }

    public void click6(View view) {
        /*************************************************************/
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
            }
        }).concatMap(new Function<Integer, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(Integer integer) throws Exception {
                List<String> list = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    list.add("I am value " + integer);
                }
                int delayTime = (int) (1 + Math.random() * 10);
                return Observable.fromIterable(list).delay(delayTime, TimeUnit.SECONDS);
            }
        }).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        Log.e("lixiaoye", "ConcatMap :accept :" + s + "\n");
                    }
                });
        /**
         * 02-24 20:49:57.180 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 1
         02-24 20:49:57.181 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 1
         02-24 20:49:57.182 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 1
         02-24 20:50:00.182 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 2
         02-24 20:50:00.183 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 2
         02-24 20:50:00.183 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 2
         02-24 20:50:07.186 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 3
         02-24 20:50:07.186 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 3
         02-24 20:50:07.187 10242-10242/lxy.android.com.rxjavademo E/lixiaoye: ConcatMap :accept :I am value 3
         */
        /*************************************************************/


        /*************************************************************/
       /* Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
            }
        }).flatMap(new Function<Integer, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(Integer integer) throws Exception {
                List<String> list = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    list.add("I am value " + integer);
                }
                int delayTime = (int) (1 + Math.random() * 10);
                return Observable.fromIterable(list).delay(delayTime, TimeUnit.SECONDS);
            }
        }).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        Log.e("lixiaoye", "flatMap: accept :" + s + "\n");
                    }
                });*/
/**
 * 02-24 20:40:23.871 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 3
 02-24 20:40:23.872 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 3
 02-24 20:40:23.872 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 3
 02-24 20:40:28.867 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 1
 02-24 20:40:28.868 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 1
 02-24 20:40:28.868 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 1
 02-24 20:40:31.869 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 2
 02-24 20:40:31.870 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 2
 02-24 20:40:31.870 5114-5114/lxy.android.com.rxjavademo E/lixiaoye: flatMap: accept :I am value 2
 */
        /*************************************************************/
       /* Observable.concat(Observable.just(1, 2, 3), Observable.just(4, 5, 6))
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        Log.e("lixiaoye", "concat: " + integer + "\n");
                    }
                });*/
        /**
         * 02-24 20:21:56.895 25480-25480/lxy.android.com.rxjavademo E/lixiaoye: concat: 1
         02-24 20:21:56.895 25480-25480/lxy.android.com.rxjavademo E/lixiaoye: concat: 2
         02-24 20:21:56.895 25480-25480/lxy.android.com.rxjavademo E/lixiaoye: concat: 3
         02-24 20:21:56.895 25480-25480/lxy.android.com.rxjavademo E/lixiaoye: concat: 4
         02-24 20:21:56.896 25480-25480/lxy.android.com.rxjavademo E/lixiaoye: concat: 5
         02-24 20:21:56.896 25480-25480/lxy.android.com.rxjavademo E/lixiaoye: concat: 6
         */
        /*************************************************************/
      /*  Flowable<Integer> flow = Flowable.range(1, 5)
                .map(v -> v * v)
                .filter(v -> v % 3 == 0);
        flow.subscribe(System.out::println);*/

    /*    Flowable.range(1, 5)
                .map(v -> v * v)
                .filter(v -> v % 3 == 0)
                .subscribe(System.out::println);//I/System.out: 9*/
        /*************************************************************/

//        Flowable.just("Hello World1").subscribe(System.out::println);
        //I/System.out: Hello World1

       /* Flowable.just("Hello World2")
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println(s);
                    }
                });*/
        //I/System.out: Hello World2

        /*************************************************************/
//        Observable.create(new ObservableOnSubscribe<Response>() {
//            @Override
//            public void subscribe(ObservableEmitter<Response> emitter) throws Exception {
//                Request request = new Request.Builder()
//                        .url("https://avatars3.githubusercontent.com/u/7948281?v=4")
//                        .get()
//                        .build();
//                Call call = new OkHttpClient().newCall(request);
//                Response response = call.execute();
//                emitter.onNext(response);
//            }
//        }).map(new Function<Response, String>() {
//            @Override
//            public String apply(Response response) throws Exception {
//                if (response.isSuccessful()){
//                    ResponseBody body=response.body();
//                    if (body!=null){
//                        Log.e("lixiaoye","map 转换前："+response.body());
////                        return new Gson().from
//                        return null;
//                    }
//                }
//                return null;
//            }
//        });
        /*************************************************************/
    }
}
