package org.fawry.Week3.DesignPattern1.Task2;

class testBadThread implements Runnable {

    @Override
    public void run() {
        badSingleton instance = badSingleton.getInstance();
    }
}