package org.fawry.Week3.DesignPattern1.Task2;

public class goodSingleton {
    private static goodSingleton instance = null;

    private goodSingleton() {}
    public static void print() {
        System.out.println("Good Singleton instance Created!");
    }

    public static goodSingleton getInstance() {
        if (instance == null) {
            synchronized (goodSingleton.class) {
                if(instance == null) {
                    print();
                    instance = new goodSingleton();
                }
            }
        }
        return instance;
    }

}
