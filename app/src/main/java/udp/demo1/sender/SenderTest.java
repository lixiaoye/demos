package udp.demo1.sender;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 发送端程序
 */

public class SenderTest {
    public static void main(String[] args) throws Exception {
        //创建一个DatagramSocket对象
        DatagramSocket datagramSocket = new DatagramSocket(3000);
        String str = "hello world!";//要发送的数据
        //创建一个要发送的数据包，数据包包括发送的数据、数据的长度，接收端的IP地址以及端口号
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(),
                InetAddress.getByName("localhost"), 8954);
        System.out.println("发送信息");
        datagramSocket.send(datagramPacket);//发送数据
        datagramSocket.close();//释放资源
    }
    /**
     * 发送端端口改成8954后，发送端和接收端使用的是同一个端口，会报错，因为计算机上一个端口只能运行一个程序
     * Exception in thread "main" java.net.BindException: Address already in use: Cannot bind
     at java.net.DualStackPlainDatagramSocketImpl.socketBind(Native Method)
     at java.net.DualStackPlainDatagramSocketImpl.bind0(DualStackPlainDatagramSocketImpl.java:84)
     at java.net.AbstractPlainDatagramSocketImpl.bind(AbstractPlainDatagramSocketImpl.java:93)
     at java.net.DatagramSocket.bind(DatagramSocket.java:392)
     at java.net.DatagramSocket.<init>(DatagramSocket.java:242)
     at java.net.DatagramSocket.<init>(DatagramSocket.java:299)
     at java.net.DatagramSocket.<init>(DatagramSocket.java:271)
     at udp.demo1.sender.SenderTest.main(SenderTest.java:17)
     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
     at java.lang.reflect.Method.invoke(Method.java:498)
     at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)

     */
}
