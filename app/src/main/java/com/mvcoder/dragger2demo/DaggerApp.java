package com.mvcoder.dragger2demo;

import android.app.Activity;
import android.app.Application;

import com.blankj.utilcode.util.Utils;
import com.mvcoder.dragger2demo.android.component.AppComponent;
import com.mvcoder.dragger2demo.android.component.DaggerAppComponent;
import com.mvcoder.dragger2demo.android.module.AppModule;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class DaggerApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        doInject();
    }

    private void doInject() {
         AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

         appComponent.inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

}
