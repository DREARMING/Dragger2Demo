package com.mvcoder.dragger2demo.qualifier.module;

import com.mvcoder.dragger2demo.qualifier.anno.CarQualifier;
import com.mvcoder.dragger2demo.qualifier.bean.Car;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @CarQualifier("provider1")  //标明注入的属性的不同特性， 生成的 Component 类将会读取 注入对象中的属性的 qualifier，从而匹配不同工厂类
    @Provides   //在同一个 Model 中的不同providers，将会构造成不同的工厂类
    static Car provideCar(){
        return new Car();
    }

    @CarQualifier("provider2")
    @Provides
    static Car providerCar2(){
        return new Car("兰博基尼","灰色");
    }

}
