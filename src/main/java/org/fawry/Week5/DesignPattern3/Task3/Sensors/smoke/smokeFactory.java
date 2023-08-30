package org.fawry.Week5.DesignPattern3.Task3.Sensors.smoke;

import org.fawry.Week5.DesignPattern3.Task3.Sensors.*;

public class smokeFactory implements sensorFactory {
    @Override
    public sensor getSensor(Inventors inventor) {
        switch (inventor) {
            case COMPANY_A:
                return new sensorA();
            case COMPANY_B:
                return new sensorB();
            default:
                throw new IllegalArgumentException("This inventor is not supported");
        }
    }
}
