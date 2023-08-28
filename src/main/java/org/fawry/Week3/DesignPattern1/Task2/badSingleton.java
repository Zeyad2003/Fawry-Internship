package org.fawry.Week3.DesignPattern1.Task2;

public class badSingleton {
    private static badSingleton instance = null;

    private badSingleton() {}

    public static void print() {
        System.out.println("Bad Singleton instance Created!");
    }

    public static badSingleton getInstance() {
        if (instance == null) {
            print();
            instance = new badSingleton();
        }
        return instance;
    }
}
