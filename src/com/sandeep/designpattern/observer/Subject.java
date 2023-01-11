package com.sandeep.designpattern.observer;

public interface Subject {
    void register(Observer ob);
    void remove(Observer ob);
    void notifyObservers();
}
