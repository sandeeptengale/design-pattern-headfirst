package com.sandeep.designpattern.strategy;

public class App {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuark();
        duck.swim();
        duck.display();

        duck.setQuackBehaviour(new MuteQuack());
        duck.performQuark();
    }
}
