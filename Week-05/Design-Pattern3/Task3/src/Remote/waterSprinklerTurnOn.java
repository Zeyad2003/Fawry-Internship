package src.Remote;

import src.Devices.waterSprinkler;

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
