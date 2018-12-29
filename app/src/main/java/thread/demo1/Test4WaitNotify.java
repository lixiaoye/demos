package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/27.
 */

public class Test4WaitNotify {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();//释放锁，转为WAITING状态
                        System.out.println("wait ove`r,status:" + Thread.currentThread().getState());//wait over,status:RUNNABLE?
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "WAITING-Thread-A");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        Thread.sleep(20000);//不释放锁，睡眠中
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notifyAll();//20秒后通知threadA
                }
            }
        }, "WAITING-Thread-B");
        threadA.start();
        threadB.start();
    }
}
