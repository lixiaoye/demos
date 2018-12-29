package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */

public class Test5Sleep {
    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ThreadA over");
            }
        }, "WAITING-Thead-A");
        threadA.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadA.getState());//TIMED_WAITING
        System.out.println("当前线程：" + Thread.currentThread().getName() + "的status为：" + Thread.currentThread().getState());//当前线程：main的status为：RUNNABLE
    }
    /**
     * 打印结果：
     TIMED_WAITING
     当前线程：main的status为：RUNNABLE
     ThreadA over
     */
    /**
     "WAITING-Thead-A" #12 prio=5 os_prio=0 tid=0x00000000186ff000 nid=0x60a8 waiting on condition [0x000000001a94e000]
     java.lang.Thread.State: TIMED_WAITING (sleeping)
     at java.lang.Thread.sleep(Native Method)
     at thread.demo1.Test5Sleep$1.run(Test5Sleep.java:13)
     at java.lang.Thread.run(Thread.java:745)

     */
}
