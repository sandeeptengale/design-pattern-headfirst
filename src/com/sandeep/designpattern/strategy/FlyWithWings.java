package com.sandeep.designpattern.strategy;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Duck can fly with wings");
        
    }
    
}
