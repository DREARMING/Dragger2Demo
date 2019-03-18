package com.mvcoder.dragger2demo.android.module;


import com.mvcoder.dragger2demo.android.activity.InjectActivity;
import com.mvcoder.dragger2demo.android.anno.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBindModule{

    @ActivityScope
    @ContributesAndroidInjector(modules = {InjectActivityModule.class})
    abstract InjectActivity getInjectActivity();

}
