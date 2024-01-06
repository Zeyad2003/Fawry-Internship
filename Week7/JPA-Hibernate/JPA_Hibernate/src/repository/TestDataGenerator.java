package org.fawry.Week7.JPA_Hibernate.repository;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class TestDataGenerator {

    public static String generateRandomName() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    public static String generateRandomSpecialization() {
        return RandomStringUtils.randomAlphabetic(8);
    }

    public static int generateRandomAge() {
        return RandomUtils.nextInt(25, 70);
    }

    public static double generateRandomPrice() {
        return RandomUtils.nextDouble(10.0, 100.0);
    }
}
