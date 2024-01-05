package src;

/**
 * A class that handles order processing by printing out order details and total cost for a given shopping cart.
 */
public class OrderProcessor {

    /**
     * A method that places an order for a given shopping cart and prints out order details and total cost for each item in the cart.
     *
     * @param cart a ShoppingCart object to place an order for
     */
    public void orderPlace(ShoppingCart cart) {
        System.out.println("Order details:");
        for (Product product : cart.getItems()) {
            System.out.println(product);
        }
        System.out.println("Total cost: $" + cart.getTotalCost());
        System.out.println("Order placed successfully!");
    }
}
