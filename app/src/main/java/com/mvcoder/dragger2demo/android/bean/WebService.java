package com.mvcoder.dragger2demo.android.bean;

import com.blankj.utilcode.util.LogUtils;

public class WebService {

    public void login(String username, String password){
        LogUtils.d("login api call >> username:  " + username + " , password : " + password);
    }

}
