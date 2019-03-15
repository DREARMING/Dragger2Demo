package com.mvcoder.dragger2demo.simple.component;

import com.mvcoder.dragger2demo.simple.bean.Man;
import com.mvcoder.dragger2demo.simple.module.CarModule;

import dagger.Component;


@Component(modules = {CarModule.class})
public interface CarComponent {

    void injectMan(Man man);

}
