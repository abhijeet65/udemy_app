package com.example.puneeth.instagramclone;

import android.content.Intent;

import java.io.Serializable;
import java.util.TimerTask;

public class TimerClass extends TimerTask{
    private SplashActivity splashActivity;
    private MainActivityPresenter presenter;
    TimerClass(SplashActivity splashActivity){
        this.splashActivity = splashActivity;
        presenter = new MainActivityPresenter();
    }
    @Override
    public void run() {
        Intent intent = new Intent(this.splashActivity, MainActivity.class);
        presenter.initResources();
        intent.putExtra("MainActivityPresenter", this.presenter);
        this.splashActivity.startActivity(intent);
        splashActivity.finish();
    }
}
