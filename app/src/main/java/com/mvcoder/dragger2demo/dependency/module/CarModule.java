package com.mvcoder.dragger2demo.dependency.module;

import com.mvcoder.dragger2demo.dependency.anno.ManScope;
import com.mvcoder.dragger2demo.dependency.bean.Car;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @ManScope
    @Provides
    static Car provideCar(){
        return new Car();
    }

    /*@Provides
    @SonScope
    static Car provideCar2(){
        return new Car("兰博基尼", "灰色");
    }*/

}
