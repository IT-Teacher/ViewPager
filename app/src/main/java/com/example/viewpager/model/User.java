package com.example.viewpager.model;

import java.io.Serializable;

public class User implements Serializable {
    public String fullName;
    public int img;

    public User(String fullName, int img) {
        this.fullName = fullName;
        this.img = img;
    }

}
