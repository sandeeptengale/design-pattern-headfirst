package com.sandeep.designpattern.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        this.descrption = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05f;
    }
     
}
