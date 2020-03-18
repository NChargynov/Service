package com.geektech.service.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geektech.service.R;
import com.geektech.service.data.NotificationHelper;
import com.geektech.service.data.ServiceBuilder;

public class MainActivity extends AppCompatActivity {
    private Button btnPush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        setUpListeners();
    }

    private void setUpListeners() {
        btnPush.setOnClickListener(v ->
                startService(new Intent(this, ServiceBuilder.class)));
    }

    private void setUpViews() {
        btnPush = findViewById(R.id.btnPush);
    }

}
