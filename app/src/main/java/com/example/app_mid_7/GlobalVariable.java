package com.example.app_mid_7;

import android.app.Application;

public class GlobalVariable extends Application {
    private String et;
    public void setEt(String et){
        this.et=et;
    }
    public String getet(){
        return et;
    }
}
