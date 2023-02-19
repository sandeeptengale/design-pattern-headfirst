package com.sandeep.designpattern.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble"); 
    }

    @Override
    public void fly() {
        System.out.println("Flying to short distance");
    }
    
}
