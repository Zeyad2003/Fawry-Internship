package org.testingtask.store;


import org.testingtask.account.Customer;

public interface Store {
    void buy(Product product, Customer customer);
}
