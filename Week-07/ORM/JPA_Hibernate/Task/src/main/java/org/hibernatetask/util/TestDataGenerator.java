package org.hibernatetask.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This class is used to generate random data for testing the task is working properly.
 */
public class TestDataGenerator {

    public static String generateRandomName() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    public static String generateRandomSpecialization() {
        return RandomStringUtils.randomAlphabetic(8);
    }

    public static int generateRandomAge() {
        return ThreadLocalRandom.current().nextInt(25, 70);
    }

    public static double generateRandomPrice() {
        return ThreadLocalRandom.current().nextDouble(10.0, 100.0);
    }
}
