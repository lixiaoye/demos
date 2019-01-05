package blockingQueue.demo3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 消费者线程
 */

public class Consumer implements Runnable {
    private ArrayBlockingQueue<Apple> mAppleQueue;

    public Consumer(ArrayBlockingQueue<Apple> queue) {
        this.mAppleQueue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        Apple apple = mAppleQueue.take();
        System.out.println("消费Apple:" + apple);
    }
}
