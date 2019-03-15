package com.mvcoder.dragger2demo.inherit.module;

import com.mvcoder.dragger2demo.inherit.bean.Car;
import com.mvcoder.dragger2demo.inherit.component.SonComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SonComponent.class)
public class CarModule {

    @Provides
    static Car provideCar(){
        return new Car();
    }

}
