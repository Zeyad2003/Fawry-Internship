package src;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that manages the shopping cart functionality, such as adding and removing items, calculating the total cost, and retrieving the items in the cart.
 */
public class ShoppingCart {
    private final ArrayList<Product> items;

    /**
     * A constructor that creates an empty shopping cart with an initial capacity of 10 items.
     */
    public ShoppingCart() {
        items = new ArrayList<>();
    }


    /**
     * A method that adds a product to the cart.
     *
     * @param product the product to be added
     */
    public void addItem(Product product) {
        items.add(product);
    }

    /**
     * A method that removes a product from the cart.
     *
     * @param product the product to be removed
     */
    public void removeItem(Product product) {
        items.remove(product);
    }

    /**
     * A method that calculates and returns the total cost of the cart by adding up the prices of all products in the cart.
     *
     * @return the total cost of the cart
     */
    public double getTotalCost() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * A method that returns an ArrayList of products in the cart.
     *
     * @return an ArrayList of products in the cart
     */
    public List<Product> getItems() {
        return items;
    }
}
