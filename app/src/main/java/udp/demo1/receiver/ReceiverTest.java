package udp.demo1.receiver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 */

public class ReceiverTest {
    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[1024];//创建一个长度为1024的字节数组，用于接收数据
        //定义一个DatagramSocket对象，监听的端口号是8954
        DatagramSocket datagramSocket = new DatagramSocket(8954);
        DatagramPacket datagramPacket = new DatagramPacket(buf, 1024);
        System.out.println("等待接收数据");
        datagramSocket.receive(datagramPacket);//等待接收数据，如果没有数据则会阻塞
        //调用DatagramPacket的方法获得接收到的信息，包括数据的内容、长度、发送的IP地址和端口号
        String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength())
                + " from "
                + datagramPacket.getAddress().getHostAddress() + ":" + datagramPacket.getPort();
        System.out.println(str);//打印接收到的信息
        datagramSocket.close();//释放资源
    }
}
