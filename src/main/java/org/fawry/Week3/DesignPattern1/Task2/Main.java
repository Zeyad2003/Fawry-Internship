package org.fawry.Week3.DesignPattern1.Task2;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new testBadThread());
        Thread t2 = new Thread(new testBadThread());
        Thread t3 = new Thread(new testBadThread());

        t1.start();
        t2.start();
        t3.start();

        t1 = new Thread(new testGoodThread());
        t2 = new Thread(new testGoodThread());
        t3 = new Thread(new testGoodThread());

        t1.start();
        t2.start();
        t3.start();
    }
}

