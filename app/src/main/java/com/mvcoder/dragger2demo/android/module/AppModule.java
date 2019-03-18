package com.mvcoder.dragger2demo.android.module;

import android.content.Context;

import com.mvcoder.dragger2demo.android.bean.WebService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context applicationContext){
        this.context = applicationContext;
    }


    @Singleton
    @Provides
    public Context getContext(){
        return context;
    }


    @Singleton
    @Provides
    public WebService webService(){
        return new WebService();
    }

}
