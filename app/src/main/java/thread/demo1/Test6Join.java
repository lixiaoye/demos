package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */

public class Test6Join {
    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-A over");
            }
        }, "WAITING-Thread-A");
        threadA.start();
        try {
            threadA.join();//main线程等待threadA线程执行完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/**
 *
"WAITING-Thread-A" #10 prio=5 os_prio=31 tid=0x00007fd2d5100000 nid=0x4e03 waiting on condition [0x000070000124c000]
        java.lang.Thread.State: TIMED_WAITING (sleeping)
        at java.lang.Thread.sleep(Native Method)
        at study.thread.ThreadStateTest$6.run(ThreadStateTest.java:103)
        at java.lang.Thread.run(Thread.java:745)
        "main" #1 prio=5 os_prio=31 tid=0x00007fd2d3815000 nid=0x1003 in Object.wait() [0x0000700000182000]
        java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x0000000795a03ec0> (a java.lang.Thread)
        at java.lang.Thread.join(Thread.java:1245)
        - locked <0x0000000795a03ec0> (a java.lang.Thread)
        at java.lang.Thread.join(Thread.java:1319)
        at study.thread.ThreadStateTest.WAITING_join(ThreadStateTest.java:118)
        at study.thread.ThreadStateTest.main(ThreadStateTest.java:13)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:483)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)
*/