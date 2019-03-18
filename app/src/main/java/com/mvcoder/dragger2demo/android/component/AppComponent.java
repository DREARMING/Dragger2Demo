package com.mvcoder.dragger2demo.android.component;

import com.mvcoder.dragger2demo.DaggerApp;
import com.mvcoder.dragger2demo.android.bean.WebService;
import com.mvcoder.dragger2demo.android.module.ActivityBindModule;
import com.mvcoder.dragger2demo.android.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AppModule.class, AndroidInjectionModule.class, ActivityBindModule.class})
public interface AppComponent {

    void inject(DaggerApp app);

    WebService WebService();

}
