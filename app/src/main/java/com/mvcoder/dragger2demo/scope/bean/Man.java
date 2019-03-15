package com.mvcoder.dragger2demo.scope.bean;

import com.mvcoder.dragger2demo.scope.component.DaggerCarComponent;

import javax.inject.Inject;

public class Man {

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
