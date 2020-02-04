package com.kanchan.broadcast_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    IntentFilter intentFilter;
    MyReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myReceiver = new MyReceiver();
        intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        registerReceiver(myReceiver,intentFilter);

    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(myReceiver);

    }
}
