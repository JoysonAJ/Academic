package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.time.ZoneId;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
/*
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
*/
        String string = intent.getAction();
        Toast.makeText(context,string ,Toast.LENGTH_LONG).show();

//        String timezone = intent.getStringExtra(time-zoneId);

    }
}