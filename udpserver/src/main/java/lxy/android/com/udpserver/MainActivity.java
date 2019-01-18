package lxy.android.com.udpserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Date;
import java.util.Enumeration;

public class MainActivity extends AppCompatActivity {

    TextView tvIp, tvPort, tvState, tvPrompt;
    private static final int udpServerPort = 5000;
    UdpServerThread udpServerThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvIp = findViewById(R.id.info_ip);
        tvPort = findViewById(R.id.info_port);
        tvState = findViewById(R.id.state);
        tvPrompt = findViewById(R.id.prompt);

        tvIp.setText(getIpAddress());
        tvPort.setText(String.valueOf(udpServerPort));
    }

    @Override
    protected void onStart() {
        super.onStart();
        udpServerThread = new UdpServerThread(udpServerPort);
        udpServerThread.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (udpServerThread != null) {
            udpServerThread.setRunning(false);
            udpServerThread = null;
        }
    }

    private class UdpServerThread extends Thread {
        private int serverPort;
        DatagramSocket socket;
        boolean running;

        public UdpServerThread(int serverPort) {
            super();
            this.serverPort = serverPort;
        }

        public void setRunning(boolean running) {
            this.running = running;
        }

        @Override
        public void run() {
            running = true;
            try {
                updateState("Starting UDP Server");
                socket = new DatagramSocket(serverPort);

                updateState("UDP Server is running");
                while (running) {
                    byte[] buf = new byte[2048];
                    //receive request
                    DatagramPacket packet = new DatagramPacket(buf, buf.length);
                    socket.receive(packet);//this code block the program flow

                    //send the response to the client at "address:port"
                    InetAddress address = packet.getAddress();
                    int port = packet.getPort();
                    String data = new String(packet.getData(), 0, packet.getLength());
                    updatePrompt("Request from:" + address + ":" + port + "--" + data + "\n");
                    String dString = "server给的response响应：" + new Date().toString() + ""
                            + "Your address " + address.toString() + ":" + String.valueOf(port);
                    buf = dString.getBytes();
                    packet = new DatagramPacket(buf, buf.length, address, port);
                    socket.send(packet);
                }
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (socket != null) {
                    socket.close();
                }
            }
        }
    }

    private void updatePrompt(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvPrompt.setText(s);
            }
        });
    }

    private void updateState(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvState.setText(s);
            }
        });
    }

    private String getIpAddress() {
        String ip = "";
        try {
            Enumeration<NetworkInterface> enumNetworkInterfaces = NetworkInterface
                    .getNetworkInterfaces();
            while (enumNetworkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = enumNetworkInterfaces
                        .nextElement();
                Enumeration<InetAddress> enumInetAddress = networkInterface
                        .getInetAddresses();
                while (enumInetAddress.hasMoreElements()) {
                    InetAddress inetAddress = enumInetAddress.nextElement();

                    if (inetAddress.isSiteLocalAddress()) {
                        ip += "SiteLocalAddress: "
                                + inetAddress.getHostAddress() + "\n";
                    }

                }

            }

        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            ip += "Something Wrong! " + e.toString() + "\n";
        }

        return ip;
    }
}