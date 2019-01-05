package blockingQueue.demo3;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 生产者线程
 */

public class Producer implements Runnable {
    private final ArrayBlockingQueue<Apple> mAppleQueue;

    public Producer(ArrayBlockingQueue<Apple> queue) {
        this.mAppleQueue = queue;
    }

    @Override
    public void run() {
        while (true) {
            produce();
        }
    }

    private void produce() {
        try {
            Apple apple = new Apple();
            mAppleQueue.put(apple);
            System.out.println("生产：" + apple);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
