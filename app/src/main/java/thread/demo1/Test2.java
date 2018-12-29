package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/27.
 */

public class Test2 {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " invoke ,status:" + Thread.currentThread().getState());
                    try {
                        Thread.sleep(200001);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "BLOCKED-Thread-A");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " invoke,status:" + Thread.currentThread().getState());
                    try {
                        Thread.sleep(200001);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "BLOCKED-Thread-B");
        threadA.start();
        threadB.start();
    }
}
/**
 打印结果：
 BLOCKED-Thread-A invoke ,status:RUNNABLE
 BLOCKED-Thread-B invoke,status:RUNNABLE
 */
/**
 * "BLOCKED-Thread-B" #13 prio=5 os_prio=0 tid=0x00000000189f7000 nid=0x3300 waiting for monitor entry [0x000000001a8cf000]
 java.lang.Thread.State: BLOCKED (on object monitor)
 at thread.demo1.Test2$2.run(Test2.java:27)
 - waiting to lock <0x00000000d681d150> (a java.lang.Object)
 at java.lang.Thread.run(Thread.java:745)

 "BLOCKED-Thread-A" #12 prio=5 os_prio=0 tid=0x00000000189f6800 nid=0x4930 waiting on condition [0x000000001a69f000]
 java.lang.Thread.State: TIMED_WAITING (sleeping)
 at java.lang.Thread.sleep(Native Method)
 at thread.demo1.Test2$1.run(Test2.java:16)
 - locked <0x00000000d681d150> (a java.lang.Object)
 at java.lang.Thread.run(Thread.java:745)
 */