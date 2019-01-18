//package design_pattern.structural_pattern.facade.demo3;
//
//import android.util.Log;
//
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.PriorityBlockingQueue;
//
///**
// * Created by LIXIAOYE on 2019/1/14.
// */
//
//public final class RequestQueue {
//    //请求队列
//    private BlockingQueue<BitmapRequest> mRequestQueue=new PriorityBlockingQueue<BitmapRequest>();
//    //默认的核心数
//    public static int DEFAULT_CORE_NUMS=Runtime.getRuntime().availableProcessors()+1;
//    //NetworkExecutor,执行网络请求的线程
//    private RequestDispatcher[] mDispatchers=null;
//    //启动RequestDispatcher
//    private final void startDispatchers(){
//        mDispatchers=new RequestDispatcher[mDispatcherNums];
//        for (int i = 0; i < mDispatcherNums; i++) {
//            Log.e("","### 启动线程 "+i);
//            mDispatchers[i]=new RequestDispatcher(mRequestQueue);
//            mDispatchers[i].start();
//        }
//    }
//    public void start(){
//        stop();
//        startDispatchers();
//    }
//}
