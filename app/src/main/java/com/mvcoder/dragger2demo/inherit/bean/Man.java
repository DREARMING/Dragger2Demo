package com.mvcoder.dragger2demo.inherit.bean;

import javax.inject.Inject;

public class Man {

    @Inject
    Car car;

    public Man(){
        //DaggerManComponent.create().injectMan(this);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
