package src.Remote;

import src.Devices.alarm;

public class alarmTurnOn implements command {
    alarm alarm;

    public alarmTurnOn() {
        this.alarm = new alarm();
    }

    @Override
    public void execute() {
        alarm.activate();
    }
}
