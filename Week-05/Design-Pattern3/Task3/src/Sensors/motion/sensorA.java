package src.Sensors.motion;


import src.Message.Adapter;
import src.Sensors.sensor;
import src.Remote.*;

import java.util.concurrent.TimeUnit;

public class sensorA implements sensor {
    @Override
    public void detect() {
        System.out.println("motion detected (type A)");
        ApplyClass.Apply();
    }


}
