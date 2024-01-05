package src;

class testBadThread implements Runnable {

    @Override
    public void run() {
        badSingleton instance = badSingleton.getInstance();
    }
}