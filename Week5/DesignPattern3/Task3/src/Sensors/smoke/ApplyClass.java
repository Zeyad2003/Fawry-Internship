package src.Sensors.smoke;

import src.Message.Adapter;
import src.Remote.*;
import src.singletonLogger.logger;

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
