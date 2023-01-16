package com.sandeep.designpattern.command;

public class SimpleRemoteController {
    private Command onCommand;
    private Command offCommand;

    public SimpleRemoteController() {}

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButtonPressed() {
        this.onCommand.execute();
    }

    public void offButtonCommand() {
        this.offCommand.execute();
    }
}
