package com.sandeep.designpattern.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        this.descrption = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
    
}
