package com.mvcoder.dragger2demo.qualifier.bean;

import com.mvcoder.dragger2demo.qualifier.anno.CarQualifier;
import com.mvcoder.dragger2demo.qualifier.component.DaggerCarComponent;

import javax.inject.Inject;

public class Man {

    @CarQualifier("provider2")
    @Inject
    Car car;

    public Man(){
        DaggerCarComponent.create().injectMan(this);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
