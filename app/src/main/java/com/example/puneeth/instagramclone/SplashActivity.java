package com.example.puneeth.instagramclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Timer timer = new Timer("defaultTimer");
        TimerClass timerClass = new TimerClass(this);
        timer.schedule(timerClass, 2000);
//        finish();
//        setContentView(R.layout.activity_splash);
    }
}
