package src.Sensors.motion;

import src.Message.Adapter;
import src.Remote.alarmTurnOff;
import src.Remote.alarmTurnOn;
import src.Remote.remoteControl;
import src.singletonLogger.logger;

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
