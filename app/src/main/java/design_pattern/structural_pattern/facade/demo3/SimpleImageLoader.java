//package design_pattern.structural_pattern.facade.demo3;
//
//import android.app.DownloadManager;
//import android.icu.text.DisplayContext;
//import android.widget.ImageView;
//
///**
// * Created by LIXIAOYE on 2019/1/14.
// */
//
//public final class SimpleImageLoader {
//    //SimpleImageLoader实例
//    private static SimpleImageLoader sInstance;
//    //网络请求队列
//    private RequestQueue mImageQueue;
//    //网络加载配置对象
//    private ImageLoaderConfig mConfig;
//
//    public void init(ImageLoaderConfig config) {
//        mConfig = config;
//        checkConfig();
//        //启动请求队列
//        mImageQueue = new RequestQueue(mConfig.threadCount);
//        mImageQueue.start();
//    }
//
//    //加载图片
//    public void displayImage(final ImageView imageView, final String uri,
//                             final DisplayConfig config, final ImageListener listener) {
//        BitmapRequest request = new BitmapRequest(imageView, uri, config, listener);
//        //加载的配置对象，如果没有设置，则使用ImageLoader的配置
//        request.displayConfig = request.displayConfig != null ? request.displayConfig : mConfig.displayConfig;
//        //设置加载策略
//        request.setLoadPolicy(mConfig.loadPolicy);
//        //添加到队列中
//        mImageQueue.addRequest(request);
//    }
//}
