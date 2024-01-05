package src.Sensors.smoke;

import src.Sensors.sensor;

public class sensorA implements sensor {
    @Override
    public void detect() {
        System.out.println("smoke detected (type A)");
        ApplyClass.Apply();
    }
}
