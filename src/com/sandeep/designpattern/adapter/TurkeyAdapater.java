package com.sandeep.designpattern.adapter;

public class TurkeyAdapater implements Duck {

    private Turkey turkey;

    public TurkeyAdapater(Turkey turkey) {
        this.turkey = turkey;
    }
    

    @Override
    public void quack() {
        this.turkey.gobble();
        
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }    
         
    }
    
}
