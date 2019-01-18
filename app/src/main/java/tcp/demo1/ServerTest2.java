package tcp.demo1;

/**
 * Created by LIXIAOYE on 2019/1/10.
 */

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程的TCP网络程序
 * 服务端开启多线程响应多用户
 */
public class ServerTest2 {
    public static void main(String[] args) throws Exception {
        new TcpServer2().listen();
    }
}

class TcpServer2 {
    private static final int PORT=7788;//定义一个静态常量作为端口号
    public void listen() throws Exception {
//创建ServerSocket对象，监听指定的端口
        ServerSocket serverSocket=new ServerSocket(PORT);
        //使用while循环不停地接收客户端发送的请求
        while (true){
            //调用ServerSocket的accept()方法与客户端建立连接
            final Socket socket=serverSocket.accept();
            //开启线程处理来自客户端的数据
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    OutputStream outputStream;//定义一个输出流对象
                    try{
                        outputStream=socket.getOutputStream();//获取客户端的输出流
                        System.out.println("开始与客户端交互数据");
                        outputStream.write(("Welcome to server.response to you").getBytes());
                        Thread.sleep(5000);
                        System.out.println("结束与客户端交互");
                        outputStream.close();
                        socket.close();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
