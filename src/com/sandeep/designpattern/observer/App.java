package com.sandeep.designpattern.observer;

public class App {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        WeatherDisplay wd1 = new WeatherDisplay(ws);

        ws.setNewMeasurements(25f, 200f, 10);
        ws.setNewMeasurements(25f, 200f, 10);
        ws.setNewMeasurements(25f, 200f, 10);

        wd1.stopDisplay();
        wd1.stopDisplay();
        
    }
}
