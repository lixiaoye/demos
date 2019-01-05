package blockingQueue.demo2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by LIXIAOYE on 2019/1/5.
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue(1024);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);

    }
    /**
     * 打印结果：
     1
     2 // 隔1s
     3 // 隔1s
     */
}
