package thread.demo2;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */
class MyThread extends Thread {

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println(Thread.currentThread().getName() + " " + j);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 3) {
                Thread t1 = new MyThread();//创建线程，此线程进入新建状态
                Thread t2 = new MyThread();//创建线程，此线程进入新建状态
                t1.start();//线程t1进入就绪状态
                t2.start();//线程t2进入就绪状态
            }
        }
    }
    /**
     main 0
     main 1
     main 2
     main 3
     main 4
     Thread-0 0
     Thread-0 1
     Thread-0 2
     Thread-0 3
     Thread-0 4
     Thread-1 0
     Thread-1 1
     Thread-1 2
     Thread-1 3
     Thread-1 4
     */
}

