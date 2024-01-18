package src;

class testGoodThread implements Runnable {

    @Override
    public void run() {
        goodSingleton instance = goodSingleton.getInstance();
    }
}