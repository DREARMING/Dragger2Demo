package com.mvcoder.dragger2demo.simple.module;

import com.mvcoder.dragger2demo.simple.bean.Car;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    static Car provideCar(){
        return new Car();
    }

}
