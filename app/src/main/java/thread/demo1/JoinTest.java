package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(new MyRunnable3());
        t3.setName("线程3");
        t3.start();
        t3.join();
        System.out.println(Thread.currentThread().getName() + "停止");
    }
}

class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        //启动t2，让t3等待t2执行完成
        Thread t2 = new Thread(new MyRunnable2());
        t2.setName("线程2");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //启动t3
        System.out.println(Thread.currentThread().getName() + "启动");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + "停止");
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        Thread t1 = new Thread(new MyRunnable1());
        t1.setName("线程1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //启动t2
        System.out.println(Thread.currentThread().getName() + "启动");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "停止");
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "启动");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "停止");
    }
}
/**
 * 打印结果：
 * 线程1启动
 * 线程1停止
 * 线程2启动
 * 线程2停止
 * 线程3启动
 * 线程3停止
 * main停止
 */