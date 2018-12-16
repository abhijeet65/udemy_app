package com.example.puneeth.instagramclone;

import android.os.Handler;
import android.view.View;

import java.io.Serializable;

public class MainActivityPresenter implements Serializable{
    private User user;
    private transient View view;

    public MainActivityPresenter(){
        this.user = new User();
    }

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void initResources(){
        //Initialize resources here, Maybe load something...

    }
    public void updateFullName(String fullName){
        user.setName(fullName);
        view.updateUserInfoTextView(this.user.toString());
    }
    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(this.user.toString());
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public interface View{
        void updateUserInfoTextView(String info);
    }
}
