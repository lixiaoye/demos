package com.example.waveview;

import android.os.Handler;
import android.os.Messenger;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new WaveView(this));
//        setContentView(R.layout.activity_main);
        Handler handler=new Handler();
    }
}
