package com.example.puneeth.instagramclone;

import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private String email;

    public User(){

    }
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Full Name : " + this.name + "\nEmail : " + this.email;
    }
}
