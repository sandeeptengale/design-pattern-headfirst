package com.sandeep.designpattern.strategy;

public class FlyNoWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Duck can fly without wings");
    }
    
}
