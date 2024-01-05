package src.Sensors.motion;

import src.Message.Adapter;
import src.Remote.*;
import src.Sensors.sensor;

import java.util.concurrent.TimeUnit;

public class sensorB implements sensor {
    @Override
    public void detect() {
        System.out.println("motion detected (type B)");
        ApplyClass.Apply();
    }
}
