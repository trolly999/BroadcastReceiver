package com.example.sysdevns.broadcastreceiver;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message = "no message";
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("message")) {
                message = extras.getString("message");
            }
        }
        Toast.makeText(context, "Broadcast received: " + message, Toast.LENGTH_LONG).show();

        Intent service = new Intent(context, ServiceV1.class);
        context.startService(service);
    }
}
