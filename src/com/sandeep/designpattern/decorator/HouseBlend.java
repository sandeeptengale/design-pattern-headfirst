package com.sandeep.designpattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.descrption = "House Blend";
    }

    @Override
    public double cost() {
        return .89f;
    }
     
}
