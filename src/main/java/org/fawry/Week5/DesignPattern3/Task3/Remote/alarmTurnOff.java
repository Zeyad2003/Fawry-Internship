package org.fawry.Week5.DesignPattern3.Task3.Remote;

import org.fawry.Week5.DesignPattern3.Task3.Devices.alarm;

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
