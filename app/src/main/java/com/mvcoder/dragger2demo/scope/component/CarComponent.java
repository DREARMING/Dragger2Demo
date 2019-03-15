package com.mvcoder.dragger2demo.scope.component;

import com.mvcoder.dragger2demo.scope.anno.CarScope;
import com.mvcoder.dragger2demo.scope.bean.Man;
import com.mvcoder.dragger2demo.scope.module.CarModule;

import dagger.Component;


@CarScope
@Component(modules = {CarModule.class})
public interface CarComponent {

    void injectMan(Man man);

}
