package src;

public class Adapter {
    private Original original;

    public Adapter() {
        original = new Original();
    }

    public void ClientDouble(double x) {
        original.OriginalDouble(x);
    }

    public void ClientInt(int x) {
        double y = x * 2.0;
        System.out.println(y);
    }

    public void ClientChar(char x) {
        for (int i = 0; i < 5; i++) {
            System.out.print(x);
        }
        System.out.println();
    }
}
