package thread.demo2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */
class Callable2 implements Callable {
    @Override
    public Object call() throws Exception {
        return "We wish you a merry christmas,and a happy new year!";
    }
}

public class FutureTaskTest {
    public static void main(String[] args) {
        Callable<Integer> myCallable = new Callable2();
        FutureTask futureTask = new FutureTask(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            //等待线程结束，并返回结果
            System.out.println(futureTask.get());//We wish you a merry christmas,and a happy new year!
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
