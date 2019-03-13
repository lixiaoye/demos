package thread.demo1;


/**
 * Created by LIXIAOYE on 2018/12/27.
 */

public class ReenterBlocked {
    public static void main(String[] args) throws InterruptedException {
        final Account account = new Account();
        Thread withdrawThread = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(200);
            }
        }, "取钱线程");
        withdrawThread.start();
        Thread.sleep(100);//确保取钱线程已经得到执行
        System.out.println("取钱线程状态为waiting:" + withdrawThread.getState().equals(Thread.State.WAITING));
        Thread depositThread = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(100);
            }
        }, "存钱线程");
        Thread.sleep(10000);//让取钱线程等待一段时间
        depositThread.start();
        Thread.sleep(100);//确保取钱线程已经被存钱线程通知到
        System.out.println("取钱线程的状态为blocked：" + withdrawThread.getState().equals(Thread.State.BLOCKED));
    }
}

class Account {
    int amount = 100;

    public synchronized void deposit(int cash) {//存钱
        amount += cash;
        notify();
        try {
            Thread.sleep(30000);//通知后暂不退出
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void withdraw(int cash) {//取钱
        while (cash > amount) {
            try {
                wait();//调用wait释放锁，线程挂起（waiting状态）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            amount -= cash;
        }
    }
}
/**
 "取钱线程" #12 prio=5 os_prio=0 tid=0x00000000187f1000 nid=0x73bc in Object.wait() [0x000000001a99f000]
 java.lang.Thread.State: WAITING (on object monitor)
 at java.lang.Object.wait(Native Method)
 - waiting on <0x00000000d681ffc8> (a thread.demo1.Account)
 at java.lang.Object.wait(Object.java:502)
 at thread.demo1.Account.withdraw(ReenterBlocked.java:49)
 - locked <0x00000000d681ffc8> (a thread.demo1.Account)
 at thread.demo1.ReenterBlocked$1.run(ReenterBlocked.java:14)
 at java.lang.Thread.run(Thread.java:745)
 小结：取钱线程显示WAITING,在收到notify通知因无法获取锁而阻塞（BLOCKED）!
 */