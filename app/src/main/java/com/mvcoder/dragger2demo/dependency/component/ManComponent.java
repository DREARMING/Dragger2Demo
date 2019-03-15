package com.mvcoder.dragger2demo.dependency.component;

import com.mvcoder.dragger2demo.dependency.anno.ManScope;
import com.mvcoder.dragger2demo.dependency.bean.Car;
import com.mvcoder.dragger2demo.dependency.bean.Man;
import com.mvcoder.dragger2demo.dependency.module.CarModule;

import dagger.Component;

@ManScope
@Component(modules = {CarModule.class})
public interface ManComponent {

    void injectMan(Man man);

    Car car();

}
