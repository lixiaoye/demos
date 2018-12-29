package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */

public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.wait(2000);//错误1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "线程thread");
        thread.start();
        Thread.sleep(100);
        lock.notify();
    }
/**
 * 错误1：
 Exception in thread "线程thread" java.lang.IllegalMonitorStateException
 at java.lang.Object.wait(Native Method)
 at thread.demo1.Test8$1.run(Test8.java:14)
 at java.lang.Thread.run(Thread.java:745)
**************
 * 错误2：
 * Exception in thread "main" java.lang.IllegalMonitorStateException
 at java.lang.Object.notify(Native Method)
 at thread.demo1.Test8.main(Test8.java:22)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:498)
 at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
 */
}
