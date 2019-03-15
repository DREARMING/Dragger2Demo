package com.mvcoder.dragger2demo.scope.module;

import com.mvcoder.dragger2demo.scope.anno.CarScope;
import com.mvcoder.dragger2demo.scope.bean.Car;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @CarScope
    @Provides
    static Car provideCar(){
        return new Car();
    }

}
