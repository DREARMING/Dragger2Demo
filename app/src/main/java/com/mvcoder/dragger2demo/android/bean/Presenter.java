package com.mvcoder.dragger2demo.android.bean;

import com.blankj.utilcode.util.LogUtils;

public class Presenter {

    WebService webService;

    public Presenter(WebService webService){
        this.webService = webService;
        /*if(DaggerApp.getAppComponent() != null){
            this.webService = DaggerApp.getAppComponent().WebService();
        }*/
    }

    public void print(){
        LogUtils.d("this is presenter print method");

        LogUtils.d("call webservice method in presenter:");

        webService.login("xiaoming","123456");
    }

}
