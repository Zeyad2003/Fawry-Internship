package org.testingtask.store;


import org.testingtask.account.AccountManager;
import org.testingtask.account.Customer;

public class MyStore implements Store {

    AccountManager accountManager;

    public MyStore(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void buy(Product product, Customer customer) {
        if (product.getQuantity() == 0) {
            throw new RuntimeException("Product out of stock");
        }

        String status = accountManager.withdraw(customer, product.getPrice());
        if (!status.equals("success")) {
            throw new RuntimeException("Payment failure: " + status);
        }
        product.setQuantity(product.getQuantity() - 1);
    }
}
