package src.Sensors.smoke;

import src.Sensors.sensor;

public class sensorB implements sensor {
    @Override
    public void detect() {
        System.out.println("smoke detected (type B)");
        ApplyClass.Apply();
    }
}
