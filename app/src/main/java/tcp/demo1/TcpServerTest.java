package tcp.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by LIXIAOYE on 2019/1/10.
 */

/**
 * TCP服务端
 */
public class TcpServerTest {
    public static void main(String[] args) throws Exception {
        new TcpServer().listen();
    }
}

//TCP服务端
class TcpServer {
    private static final int PORT = 7788;//定义一个端口号

    public void listen() throws IOException, InterruptedException {
        //创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(PORT);
        //调用ServerSocket对象的accept()方法接收数据
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();//获取客户端输出流
        System.out.println("开始与客户端的交互");
        outputStream.write(("welcome to server!").getBytes());
        Thread.sleep(5000);//模拟其他操作
        System.out.println("结束交互");
        outputStream.close();
        socket.close();
    }
}
