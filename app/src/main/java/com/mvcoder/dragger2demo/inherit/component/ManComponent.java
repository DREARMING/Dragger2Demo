package com.mvcoder.dragger2demo.inherit.component;

import com.mvcoder.dragger2demo.inherit.bean.Man;
import com.mvcoder.dragger2demo.inherit.module.CarModule;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface ManComponent {

    void injectMan(Man man);

    SonComponent.Builder sonComponent();    // 用来创建 Subcomponent

}
