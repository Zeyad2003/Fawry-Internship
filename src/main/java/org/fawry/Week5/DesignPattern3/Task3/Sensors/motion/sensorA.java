package org.fawry.Week5.DesignPattern3.Task3.Sensors.motion;


import org.fawry.Week5.DesignPattern3.Task3.Message.Adapter;
import org.fawry.Week5.DesignPattern3.Task3.Sensors.sensor;
import org.fawry.Week5.DesignPattern3.Task3.Remote.*;

import java.util.concurrent.TimeUnit;

public class sensorA implements sensor {
    @Override
    public void detect() {
        System.out.println("motion detected (type A)");
        ApplyClass.Apply();
    }


}
