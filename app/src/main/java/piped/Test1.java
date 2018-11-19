package piped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        final PipedInputStream pis = new PipedInputStream();//创建PipedInputStream对象
        final PipedOutputStream pos = new PipedOutputStream();//
        //PipedInputStream和PipedOutputStream建立连接，也可以写pos.connect(pis);
        pis.connect(pos);
        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //将从键盘读取的数据写入管道流
                PrintStream ps = new PrintStream(pos);
                while (true) {
                    try {
                        System.out.print(Thread.currentThread().getName() + "输入:");
                        ps.println(br.readLine());
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "发送数据的线程").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                //从管道中读出数据，每读一行数据输出一次
                BufferedReader br = new BufferedReader(new InputStreamReader(pis));
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "收到内容：" + br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "接收数据的线程").start();
        /**
         发送数据的线程输入:lixiaoye
         接收数据的线程收到内容：lixiaoye
         发送数据的线程输入:hhahaahahhaa
         接收数据的线程收到内容：hhahaahahhaa
         发送数据的线程输入:nihao
         接收数据的线程收到内容：nihao
         发送数据的线程输入:喜福会
         接收数据的线程收到内容：喜福会
         发送数据的线程输入:
         */
    }
}
