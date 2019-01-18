package tcp.demo2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 服务端
 */

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);//创建ServerSocket对象
        while (true) {
            //调用accept()方法接收客户端请求，得到Socket对象
            Socket socket = serverSocket.accept();
            //每当和客户端建立Socket连接后，单独开启一个线程处理和客户端的交互
            new Thread(new ServerThread(socket)).start();
        }
    }

}

class ServerThread implements Runnable {
    private Socket socket;//持有一个Socket类型的属性

    public ServerThread(Socket socket) {//构造方法中将Socket对象作为实参传入
        this.socket = socket;
    }

    @Override
    public void run() {
        String ip = socket.getInetAddress().getHostAddress();//获取客户端的IP地址
        int count = 1;//上传图片个数
        try {
            InputStream inputStream = socket.getInputStream();
            File parentFile = new File("e:\\upload\\");//创建上传图片目录的File对象
            if (!parentFile.exists()) {//如果不存在，就创建目录
                parentFile.mkdir();
            }
            //把客户端的IP地址作为上传文件的文件名
            File file = new File(parentFile, ip + "(" + count + ").jpg");
            while (file.exists()) {
                //如果文件名存在，则把count++
                file = new File(parentFile, ip + "(" + (count++) + ").jpg");
            }
            //创建FileOutputStream对象
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buf = new byte[1024];//定义一个字节数组
            int len = 0;//定义一个int类型的变量len，初始值为0
            while ((len = inputStream.read(buf)) != -1) {//循环读取数据
                fos.write(buf, 0, len);
            }
            OutputStream outputStream = socket.getOutputStream();//获取服务端的输出流
            outputStream.write("上传成功".getBytes());//上传成功后向客户端写出“上传成功”
            fos.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
