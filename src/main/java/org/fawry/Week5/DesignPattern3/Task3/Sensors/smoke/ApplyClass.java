package org.fawry.Week5.DesignPattern3.Task3.Sensors.smoke;

import org.fawry.Week5.DesignPattern3.Task3.Message.Adapter;
import org.fawry.Week5.DesignPattern3.Task3.Remote.*;
import org.fawry.Week5.DesignPattern3.Task3.singletonLogger.logger;

import java.util.concurrent.TimeUnit;

public class ApplyClass {
    static void Apply() {
        remoteControl remoteControl = new remoteControl();
        remoteControl.setCommand(new waterSprinklerTurnOn());
        remoteControl.pressButton();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        remoteControl.setCommand(new waterSprinklerTurnOff());
        remoteControl.pressButton();

        Adapter.sendAll(true);

        logger.getInstance().logSmoke();
    }
}
