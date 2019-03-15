package com.mvcoder.dragger2demo.inherit.module;

import com.mvcoder.dragger2demo.inherit.bean.Bike;

import dagger.Module;
import dagger.Provides;

@Module
public class BikeModule {

    @Provides
    static Bike provideBike(){
        return new Bike();
    }

}
