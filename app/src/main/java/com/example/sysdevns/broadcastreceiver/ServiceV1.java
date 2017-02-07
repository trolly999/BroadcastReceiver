package com.example.sysdevns.broadcastreceiver;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

public class ServiceV1 extends IntentService {

    public static final String TAG = "Service";

    public ServiceV1() {
        super(ServiceV1.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("My Service Title")
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_stat_name)
                .setContentText("Notification triggered from Service1");

        final NotificationManager manager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        Log.d(TAG, "onHandleIntent: About to sleep");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "onHandleIntent: Woken up now");

        manager.notify(1, builder.build());
    }
}
