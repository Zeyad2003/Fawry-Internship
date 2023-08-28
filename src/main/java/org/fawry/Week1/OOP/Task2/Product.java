package org.fawry.Week1.OOP.Task2;

/**
 * A class that represents an individual product with a name and a price.
 */
public class Product {

    private final String name;
    private final double price;

    /**
     * A constructor that creates a product with the given name and price.
     *
     * @param name  the name of the product
     * @param price the price of the product
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * A getter method that returns the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * A getter method that returns the price of the product.
     *
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * A method that returns a string representation of the product with its name and price.
     *
     * @return a string representation of the product
     */
    public String toString() {
        return name + ": " + price + "$";
    }
}
