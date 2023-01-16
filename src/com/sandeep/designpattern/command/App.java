package com.sandeep.designpattern.command;

public class App {
    public static void main(String[] args) {
        SimpleRemoteController remote = new SimpleRemoteController();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(lightOn, lightOff);
        remote.onButtonPressed();
        remote.offButtonCommand();
    }
}
