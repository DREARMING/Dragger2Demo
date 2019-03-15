package com.mvcoder.dragger2demo.dependency.bean;

import android.text.TextUtils;

import com.blankj.utilcode.util.LogUtils;

public class Car {

    private String name;

    private String color;

    public Car(){
    }

    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void go(){
        String temp = "car";
        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(color)){
            temp = color + "的" + name;
        }
        LogUtils.d(temp + " go");
    }

}
