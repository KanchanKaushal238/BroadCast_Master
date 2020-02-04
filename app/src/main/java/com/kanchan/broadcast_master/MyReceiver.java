package com.kanchan.broadcast_master;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent)
    {
        ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected =activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        if(isConnected)
        {
            try {
                Toast.makeText(context, "Network is connected", Toast.LENGTH_LONG).show();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        else
        {
            Toast.makeText(context, "netwok is disconneccted", Toast.LENGTH_LONG).show();
        }
    }

}
