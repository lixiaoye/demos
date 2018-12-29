package thread.demo1;

import java.util.concurrent.locks.Condition;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */

public class Test7 {
    public static void main(String[] args) {
        Object obj = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait(50000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("threadA over!");
                }
            }
        }, "TIMED_WAITING-Thread-A");
        threadA.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadA.getState());//TIMED_WAITING
    }
    /**
     * 打印结果：
     TIMED_WAITING
     threadA over!
     */
/**
 "TIMED_WAITING-Thread-A" #12 prio=5 os_prio=0 tid=0x0000000018845800 nid=0x5fd0 in Object.wait() [0x000000001a21f000]
 java.lang.Thread.State: TIMED_WAITING (on object monitor)
 at java.lang.Object.wait(Native Method)
 - waiting on <0x00000000d681dc20> (a java.lang.Object)
 at thread.demo1.Test7$1.run(Test7.java:15)
 - locked <0x00000000d681dc20> (a java.lang.Object)
 at java.lang.Thread.run(Thread.java:745)
 */
}
