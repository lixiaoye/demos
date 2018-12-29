package thread.demo1;

/**
 * Created by lixiaoye on 2018/12/4.
 */

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        System.out.println("new Thread(): thread name:" + thread.getName() + ",thread.id:"
                + thread.getId() + ",thread status:" + thread.getState());//new Thread(): thread name:Thread-0,thread.id:12,thread status:NEW
        thread.start();
        System.out.println("thread.start(): thread name:" + thread.getName() + ",thread.id:"
                + thread.getId() + ",thread status:" + thread.getState());//thread.start(): thread name:Thread-0,thread.id:12,thread status:RUNNABLE

    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("run(): thread name:" + Thread.currentThread().getName() + ",thread.id:"
                    + Thread.currentThread().getId() + ",thread status:"
                    + Thread.currentThread().getState());//run(): thread name:Thread-0,thread.id:12,thread status:RUNNABLE
        }
    }
}
