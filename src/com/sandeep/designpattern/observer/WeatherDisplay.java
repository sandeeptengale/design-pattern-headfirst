package com.sandeep.designpattern.observer;

public class WeatherDisplay implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;
    private Subject weatherStation;

    public WeatherDisplay(Subject sb) {
        this.weatherStation = sb;
        this.weatherStation.register(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Temperature: " + this.temperature + " Pressure: " + this.pressure + " Humidity: " + this.humidity);
    }

    public void stopDisplay() {
        this.weatherStation.remove(this);
    }
    
}
