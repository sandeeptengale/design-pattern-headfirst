package com.sandeep.designpattern.factory;

public class App {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");

        System.out.println(pizza.prepare());
        System.out.println(pizza.cut());
        System.out.println(pizza.pack());
    }
}
