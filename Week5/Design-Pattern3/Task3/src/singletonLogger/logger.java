package src.singletonLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class logger {
    private static logger instance;
    FileWriter fileWriter;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    private logger() {
        File file = new File("log.txt");
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
            fileWriter.write(LocalDateTime.now().format(formatter) + ": smoke detected\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void logMotion() {
        System.out.println("Log motion....");
        try {
            fileWriter.write(LocalDateTime.now().format(formatter) + ": motion detected\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
