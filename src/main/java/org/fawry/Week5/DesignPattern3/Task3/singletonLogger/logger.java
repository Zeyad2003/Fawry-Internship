package org.fawry.Week5.DesignPattern3.Task3.singletonLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class logger {
    private static logger instance;
    FileWriter fileWriter;

    private logger() {
        File file = new File("./src/main/java/org/fawry/Week5/DesignPattern3/Task3/log.txt");
        try {
            file.createNewFile();
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static logger getInstance() {
        if (instance == null) {
            synchronized (logger.class) {
                if (instance == null) {
                    instance = new logger();
                }
            }
        }
        return instance;
    }

    public void logSmoke() {
        System.out.println("Log smoke....");
        try {
            fileWriter.write(LocalDateTime.now() + ":smoke detected\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void logMotion() {
        System.out.println("Log motion....");
        try {
            fileWriter.write(LocalDateTime.now() + ":motion detected\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
