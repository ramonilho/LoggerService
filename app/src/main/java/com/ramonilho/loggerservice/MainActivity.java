package com.ramonilho.loggerservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.startService)
    public void startService() {
        intent = new Intent(this, LoggerService.class);
        startService(intent);
    }

    @OnClick(R.id.stopService)
    public void stopService() {
        stopService(intent);
    }
}
