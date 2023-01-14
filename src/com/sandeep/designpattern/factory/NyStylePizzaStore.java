package com.sandeep.designpattern.factory;

public class NyStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("veggie".equals(type)) {
            return new VeggiePizza();
        }
        return null;
    }
    
}
