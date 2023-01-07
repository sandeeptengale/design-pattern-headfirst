package com.sandeep.designpattern.strategy;

public class MuteQuack implements QuarkBehaviour {

    @Override
    public void quark() {
        System.out.println("I can't Quack!");
        
    }
    
}