package com.sandeep.designpattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quarkBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void swim() {
        System.out.println("I can swim faster");
        
    }

    @Override
    void display() {
        System.out.println("I am real Mallard duck");
        
    }
    
}
