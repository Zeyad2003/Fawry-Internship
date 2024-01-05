package src;

public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.ClientDouble(3.14); // prints 3.14
        adapter.ClientInt(5); // prints 10.0
        adapter.ClientChar('a'); // prints aaaaa
    }
}
