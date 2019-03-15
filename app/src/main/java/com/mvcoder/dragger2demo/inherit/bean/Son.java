package com.mvcoder.dragger2demo.inherit.bean;

import com.mvcoder.dragger2demo.inherit.component.DaggerManComponent;
import com.mvcoder.dragger2demo.inherit.component.ManComponent;
import com.mvcoder.dragger2demo.inherit.component.SonComponent;

import javax.inject.Inject;

public class Son {

    @Inject
    Car car;

    @Inject
    Bike bike;

    public Son(){
        ManComponent manComponent = DaggerManComponent.builder().build();
        SonComponent sonComponent = manComponent.sonComponent().build();
        sonComponent.injectSon(this);
    }

    public void drive(){
        car.go();
        bike.go();
    }

}
