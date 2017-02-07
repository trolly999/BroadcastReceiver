package com.example.sysdevns.broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeBroadcast();
            }
        });
    }

    private void makeBroadcast() {
        Intent intent = new Intent();
        intent.setAction("com.example.sysdevns.BROADCAST_INTENT");
        intent.putExtra("message", "Hola Mundial");
        sendBroadcast(intent);
    }
}
