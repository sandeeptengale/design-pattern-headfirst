package com.sandeep.designpattern.factory;

public class CheesePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Cheese pizza";
    }

    @Override
    public String prepare() {
        return "Preparing cheese pizza";
    }

    @Override
    public String cut() {
        return "Cutting cheese pizza";
    }

    @Override
    public String pack() {
        return "Packing cheese pizza";
    }
    
}
