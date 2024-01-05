package src;

import src.Sensors.Inventors;
import src.Sensors.motion.motionFactory;
import src.Sensors.sensor;
import src.Sensors.sensorFactory;
import src.Sensors.smoke.smokeFactory;

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
