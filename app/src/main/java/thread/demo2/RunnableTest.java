package thread.demo2;

/**
 * Created by LIXIAOYE on 2018/12/29.
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        //todo
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
