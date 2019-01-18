package tcp.demo1;


import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * TCP客户端
 */

public class TcpClientTest {
    public static void main(String[] args) throws Exception {
        new TcpClient().connect();
    }
}

//TCP客户端
class TcpClient {
    private static final int PORT = 7788;//服务端的端口号

    public void connect() throws Exception {
        //创建一个Socket并连接到给出地址和端口号的计算机
        Socket socket = new Socket(InetAddress.getLocalHost(), PORT);
        InputStream inputStream = socket.getInputStream();//获取服务端数据的流
        byte[] buf = new byte[1024];//定义1024个字节数组缓冲区中
        int len = inputStream.read(buf);//将数据读取到缓冲区中
        System.out.println(new String(buf, 0, len));//将缓冲区中的数据输出
        socket.close();//关闭Socket对象，释放资源

    }
}
