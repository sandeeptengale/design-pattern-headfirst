package com.sandeep.designpattern.decorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Whip";
    }

    @Override
    public double cost() {
        return 0.5f + this.beverage.cost();
    }
     
}
