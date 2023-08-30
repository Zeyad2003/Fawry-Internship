package org.fawry.Week5.DesignPattern3.Task3.Remote;

import org.fawry.Week5.DesignPattern3.Task3.Devices.alarm;

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
