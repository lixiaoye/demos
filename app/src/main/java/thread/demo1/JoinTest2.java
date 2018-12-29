package thread.demo1;


/**
 * Created by LIXIAOYE on 2018/12/29.
 */
public class JoinTest2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        t1.setName("线程a");
        t2.setName("线程b");
        t3.setName("线程c");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        System.out.println(Thread.currentThread().getName() + "...");
    }

}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.printf("%s启动\n",Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "停止");
        System.out.printf("%s停止\n",Thread.currentThread().getName());
    }
}
/**
 * 打印结果：
 * 线程a启动
 * 线程a停止
 * 线程b启动
 * 线程b停止
 * 线程c启动
 * 线程c停止
 * main...
 */
