package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/27.
 */

public class TestBlocked {

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.increase();
            }
        }, "线程thead1");
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.increase();
            }
        }, "线程thread2");
        thread2.start();
        Thread.sleep(100);//确保t2 run执行了
        System.out.println("线程thread2的状态为blocked：" + thread2.getState().equals(Thread.State.BLOCKED));//线程thread2的状态为blocked：true
    }
}

class Counter {
    int counter;

    public synchronized void increase() {
        counter++;
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}