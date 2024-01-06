package src.Remote;

import src.Devices.waterSprinkler;

public class waterSprinklerTurnOff implements command {
    waterSprinkler waterSprinkler;

    public waterSprinklerTurnOff() {
        this.waterSprinkler = new waterSprinkler();
    }

    @Override
    public void execute() {
        waterSprinkler.deactivate();
    }
}
