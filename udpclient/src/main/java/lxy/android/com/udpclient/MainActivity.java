package lxy.android.com.udpclient;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {
    private EditText etAddress, etPort;
    private Button btnConnect;
    private TextView tvState, tvRx;

    UdpClientHandler udpClientHandler;
    UdpClientThread udpClientThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAddress = findViewById(R.id.address);
        etPort = findViewById(R.id.port);
        btnConnect = findViewById(R.id.connect);
        tvState = findViewById(R.id.state);
        tvRx = findViewById(R.id.received);

        btnConnect.setOnClickListener(btnConnectListener);

        udpClientHandler = new UdpClientHandler(this);
    }

    View.OnClickListener btnConnectListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //点击连接按钮，开启线程进行udp通信
            udpClientThread = new UdpClientThread(
                    etAddress.getText().toString(),
                    Integer.parseInt(etPort.getText().toString()),
                    udpClientHandler);
            udpClientThread.start();
            btnConnect.setEnabled(false);
        }
    };

    public static class UdpClientHandler extends Handler {
        public static final int UPDATE_STATE = 0;
        public static final int UPDATE_MSG = 1;
        public static final int UPDATE_END = 2;
        private MainActivity parent;

        public UdpClientHandler(MainActivity parent) {
            this.parent = parent;
        }

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPDATE_STATE:
                    parent.updateState((String) msg.obj);
                    break;
                case UPDATE_MSG:
                    parent.updateRxMsg((String) msg.obj);
                    break;
                case UPDATE_END:
                    parent.clientEnd();
                    break;
                default:
                    super.handleMessage(msg);
            }
        }
    }

    private void clientEnd() {
        udpClientThread = null;
        tvState.setText("clientEnd()");
        btnConnect.setEnabled(true);
    }

    private void updateRxMsg(String obj) {
        tvRx.setText(obj + "\n");
    }

    private void updateState(String obj) {
        tvState.setText(obj);
    }
}
