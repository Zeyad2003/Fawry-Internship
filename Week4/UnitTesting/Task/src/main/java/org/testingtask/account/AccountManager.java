package org.testingtask.account;

public interface AccountManager {

    void deposit(Customer customer, int amount);

    String withdraw(Customer customer, int amount);

}
