package com.sandeep.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherStation() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer ob) {
        observerList.add(ob);
        
    }

    @Override
    public void remove(Observer ob) {
        if (observerList.size() > 0) {
            observerList.remove(ob);
        } else {
            System.out.println("No observer present in the list");
        }
        
    }

    @Override
    public void notifyObservers() {
        for (Observer ob: observerList) {
            ob.update(temperature, pressure, humidity);
        }
    }


    public void setNewMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
    
}
