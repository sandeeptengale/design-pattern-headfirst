package com.sandeep.designpattern.decorator;

public class App {
    public static void main(String[] args) {
        Beverage espress = new Espresso();
        System.out.println(espress.getDescription() + " will cost " + espress.cost() + " $");

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " will cost " + beverage1.cost() + " $");

        Beverage beverage2 = new Mocha(beverage1);
        System.out.println(beverage2.getDescription() + " will cost " + beverage2.cost() + " $");
    }
    
}
