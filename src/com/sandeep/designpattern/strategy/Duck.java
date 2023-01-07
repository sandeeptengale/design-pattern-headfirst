package com.sandeep.designpattern.strategy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuarkBehaviour quarkBehaviour;
    abstract void swim();
    abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuark() {
        quarkBehaviour.quark();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuarkBehaviour qb) {
        this.quarkBehaviour = qb;
    }
}
