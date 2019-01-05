package blockingQueue.demo3;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by LIXIAOYE on 2019/1/5.
 */
class Apple {
    public Apple() {

    }
}

public class ArrayBlockingQueueDemo {
    private final static ArrayBlockingQueue<Apple> queue = new ArrayBlockingQueue<Apple>(1);

    public static void main(String[] args) {
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
