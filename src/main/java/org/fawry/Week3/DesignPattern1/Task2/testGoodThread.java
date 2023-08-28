package org.fawry.Week3.DesignPattern1.Task2;

class testGoodThread implements Runnable {

    @Override
    public void run() {
        goodSingleton instance = goodSingleton.getInstance();
    }
}