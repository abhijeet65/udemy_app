package com.example.puneeth.instagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View{


    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = (MainActivityPresenter)getIntent().getSerializableExtra("MainActivityPresenter");
    }

    @Override
    public void updateUserInfoTextView(String info) {

    }
}
