package com.mvcoder.dragger2demo.inherit.component;


import com.mvcoder.dragger2demo.inherit.bean.Son;
import com.mvcoder.dragger2demo.inherit.module.BikeModule;

import dagger.Subcomponent;

//如果 MainComponent 设置了 scope，依赖的Component必须设置 scope，并且不能跟ManComponent相同
@Subcomponent(modules = {BikeModule.class})
public interface SonComponent {

    void injectSon(Son son);

    @Subcomponent.Builder
    interface Builder{
        SonComponent build();
    }
}
