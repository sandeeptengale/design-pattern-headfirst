package com.sandeep.designpattern.strategy;

public class Quack implements QuarkBehaviour {

    @Override
    public void quark() {
        System.out.println("Quack Quack!!");
        
    }
    
}
