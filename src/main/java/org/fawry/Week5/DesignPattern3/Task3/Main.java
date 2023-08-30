package org.fawry.Week5.DesignPattern3.Task3;

import org.fawry.Week5.DesignPattern3.Task3.Sensors.Inventors;
import org.fawry.Week5.DesignPattern3.Task3.Sensors.motion.motionFactory;
import org.fawry.Week5.DesignPattern3.Task3.Sensors.sensor;
import org.fawry.Week5.DesignPattern3.Task3.Sensors.sensorFactory;
import org.fawry.Week5.DesignPattern3.Task3.Sensors.smoke.smokeFactory;

public class Main {
    public static void main(String[] args) {
        sensorFactory smokeFactory = new smokeFactory();
        sensorFactory motionFactory = new motionFactory();

        sensor smokeA = smokeFactory.getSensor(Inventors.COMPANY_A);
        sensor motionB = motionFactory.getSensor(Inventors.COMPANY_B);

        smokeA.detect();
        motionB.detect();
    }
}
