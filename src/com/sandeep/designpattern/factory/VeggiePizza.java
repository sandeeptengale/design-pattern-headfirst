package com.sandeep.designpattern.factory;

public class VeggiePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Veggie pizza";
    }

    @Override
    public String prepare() {
        return "Preapring veggie pizza";
    }

    @Override
    public String cut() {
        return "Cutting veggie pizza";
    }

    @Override
    public String pack() {
        return "Packing veggie pizza";
    }
    
    
}
