package synchronizedDemo;


import java.util.Hashtable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lixiaoye on 2019/3/19.
 */

public class Test implements Runnable {
    int b = 100;

    /**
     * 锁对象是方法调用所在的对象即this
     * m1和m2方法时是互斥的，这意味同一时间只能有一个方法被执行
     *
     * @throws InterruptedException
     */
    synchronized void m1() throws InterruptedException {
        b = 1000;
        Thread.sleep(500);//让出cpu资源，但是不释放监视锁！
        System.out.println("b==" + b);
        ReentrantLock reentrantLock=new ReentrantLock();
        Object obj=new Object();
    }

    /**
     * 锁对象是this
     * m1和m2方法时是互斥的，这意味同一时间只能有一个方法被执行
     *
     * @throws InterruptedException
     */
    synchronized void m2() throws InterruptedException {
        Thread.sleep(250);
        b = 2000;
    }

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();//启动子线程
        test.m2();//
        System.out.println("main thread b=" + test.b);
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 打印结果：
     * main thread b=1000
     b==1000
     ------------
     debug:
     main thread b=2000
     b==1000
     */
}
