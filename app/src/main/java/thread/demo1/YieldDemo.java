package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " in control "+i);
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 5; i++) {
            //contril passes to child thread
            Thread.yield();
            //after execution of child thread main thread taks over
            System.out.println(Thread.currentThread().getName() + " in control "+i);
        }
    }
    /**
     * 输出可能因机器而异，但yield（）线程执行的可能性首先高于另一个线程，
     * 因为主线程始终暂停其执行并给予子线程（具有相同优先级）的机会。
     -----1-----
     main in control 0
     main in control 1
     main in control 2
     main in control 3
     main in control 4
     Thread-0 in control
     Thread-0 in control
     Thread-0 in control
     Thread-0 in control
     Thread-0 in control
     ---2----
     Thread-0 in control 0
     Thread-0 in control 1
     Thread-0 in control 2
     Thread-0 in control 3
     Thread-0 in control 4
     main in control 0
     main in control 1
     main in control 2
     main in control 3
     main in control 4
     ----3--
     Thread-0 in control 0
     main in control 0
     Thread-0 in control 1
     main in control 1
     Thread-0 in control 2
     main in control 2
     Thread-0 in control 3
     main in control 3
     Thread-0 in control 4
     main in control 4
     ----4--
     main in control 0
     Thread-0 in control 0
     main in control 1
     Thread-0 in control 1
     main in control 2
     Thread-0 in control 2
     main in control 3
     Thread-0 in control 3
     main in control 4
     Thread-0 in control 4
     ---5-----
     Thread-0 in control 0
     Thread-0 in control 1
     Thread-0 in control 2
     main in control 0
     Thread-0 in control 3
     Thread-0 in control 4
     main in control 1
     main in control 2
     main in control 3
     main in control 4
     */
}

