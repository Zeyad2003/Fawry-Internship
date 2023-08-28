package org.fawry.Week1.OOP.Task2;

/**
 * A class that contains the main method and tests the functionality of the online shop system by creating some sample products, a shopping cart, and an order processor.
 */
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Book", 10.99);
        Product p2 = new Product("Pen", 1.49);
        Product p3 = new Product("Notebook", 4.99);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(p1);
        cart.addItem(p2);
        cart.addItem(p3);

        System.out.println("Total cost: " + cart.getTotalCost() + "$");

        cart.removeItem(p3);

        System.out.println("Updated total cost after removing: " + cart.getTotalCost() + "$");

        OrderProcessor op = new OrderProcessor();
        op.orderPlace(cart);
    }
}
