package org.fawry.Week5.DesignPattern3.Task3.Sensors.smoke;

import org.fawry.Week5.DesignPattern3.Task3.Sensors.sensor;

public class sensorA implements sensor {
    @Override
    public void detect() {
        System.out.println("smoke detected (type A)");
        ApplyClass.Apply();
    }
}
