package com.mvcoder.dragger2demo.qualifier.component;

import com.mvcoder.dragger2demo.qualifier.bean.Man;
import com.mvcoder.dragger2demo.qualifier.module.CarModule;

import dagger.Component;


@Component(modules = {CarModule.class})
public interface CarComponent {

    void injectMan(Man man);

}
