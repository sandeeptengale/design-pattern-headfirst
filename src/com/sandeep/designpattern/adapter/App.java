package com.sandeep.designpattern.adapter;

public class App {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapater(wildTurkey);

        System.out.println("Turkey says..");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Mallard duck says..");
        test(mallardDuck);

        System.out.println("TurkeyDuck says...");
        test(turkeyAdapter);
    }    

    public static void test(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
