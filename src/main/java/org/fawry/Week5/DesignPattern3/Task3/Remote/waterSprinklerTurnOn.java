package org.fawry.Week5.DesignPattern3.Task3.Remote;

import org.fawry.Week5.DesignPattern3.Task3.Devices.waterSprinkler;

public class waterSprinklerTurnOn implements command {
    waterSprinkler waterSprinkler;

    public waterSprinklerTurnOn() {
        this.waterSprinkler = new waterSprinkler();
    }

    @Override
    public void execute() {
        waterSprinkler.activate();
    }
}
