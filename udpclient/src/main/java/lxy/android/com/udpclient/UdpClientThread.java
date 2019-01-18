package lxy.android.com.udpclient;


import android.os.Message;
import android.view.LayoutInflater;
import android.widget.SimpleCursorTreeAdapter;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Created by LIXIAOYE on 2019/1/10.
 */

public class UdpClientThread extends Thread {
    String dstAddress;
    int dstPort;
    private boolean running;
    MainActivity.UdpClientHandler handler;
    DatagramSocket socket;
    InetAddress inetAddress;

    public UdpClientThread(String addr, int port, MainActivity.UdpClientHandler handler) {
        super();
        dstAddress = addr;
        dstPort = port;
        this.handler = handler;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    private void sendState(String state) {
        handler.sendMessage(Message.obtain(handler, MainActivity.UdpClientHandler.UPDATE_STATE, state));
    }

    @Override
    public void run() {
        sendState("connecting...");
        running = true;
        try {
            socket = new DatagramSocket();
            inetAddress = InetAddress.getByName(dstAddress);

            //send request
            String str = "来自client的字符串：哈哈哈";
            byte[] buf = str.getBytes();
            DatagramPacket packet = new DatagramPacket(buf, buf.length, inetAddress, dstPort);
            socket.send(packet);
            sendState("connected");

            //get response
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String line = new String(packet.getData(), 0, packet.getLength());
            handler.sendMessage(Message.obtain(handler, MainActivity.UdpClientHandler.UPDATE_MSG, line));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
                handler.sendEmptyMessage(MainActivity.UdpClientHandler.UPDATE_END);
            }
        }
    }
}
