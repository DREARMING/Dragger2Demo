package com.mvcoder.dragger2demo.android.module;


import com.mvcoder.dragger2demo.android.anno.ActivityScope;
import com.mvcoder.dragger2demo.android.bean.Presenter;
import com.mvcoder.dragger2demo.android.bean.WebService;

import dagger.Module;
import dagger.Provides;

@Module
public class InjectActivityModule {

    @ActivityScope
    @Provides
    public Presenter getPresenter(WebService webService){
        return new Presenter(webService);
    }


}
