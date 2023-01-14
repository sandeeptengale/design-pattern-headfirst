package com.sandeep.designpattern.decorator;

public abstract class Beverage {
    public String descrption = "Unknown";

    public String getDescription() {
        return descrption;
    }

    public abstract double cost(); 
}
