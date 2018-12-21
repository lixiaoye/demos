package thread.demo2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by LIXIAOYE on 2018/12/21.
 */

public class TestCallable {
    //创建线程类
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(myCallable);
        try {
            //等待线程结束，并返回结果
            System.out.println(future.get());
            //打印结果：We wish you a merry christmas,and a happy new year!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
