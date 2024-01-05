package src.Remote;

import src.Devices.alarm;

public class alarmTurnOff implements command {
    alarm alarm;

    public alarmTurnOff() {
        this.alarm = new alarm();
    }

    @Override
    public void execute() {
        alarm.deactivate();
    }
}
