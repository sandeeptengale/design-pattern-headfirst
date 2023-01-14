package com.sandeep.designpattern.factory;

public abstract class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
