package org.fawry.Week5.DesignPattern3.Task3.Sensors.motion;

import org.fawry.Week5.DesignPattern3.Task3.Message.Adapter;
import org.fawry.Week5.DesignPattern3.Task3.Remote.alarmTurnOff;
import org.fawry.Week5.DesignPattern3.Task3.Remote.alarmTurnOn;
import org.fawry.Week5.DesignPattern3.Task3.Remote.remoteControl;
import org.fawry.Week5.DesignPattern3.Task3.singletonLogger.logger;

import java.util.concurrent.TimeUnit;

public class ApplyClass {
    static void Apply() {
        remoteControl remoteControl = new remoteControl();
        remoteControl.setCommand(new alarmTurnOn());
        remoteControl.pressButton();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        remoteControl.setCommand(new alarmTurnOff());
        remoteControl.pressButton();

        Adapter.sendAll(false);

        logger.getInstance().logMotion();
    }
}
