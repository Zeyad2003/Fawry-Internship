package org.fawry.Week4.UnitTesting.Task.Account;

public interface AccountManager {

    void deposit(Customer customer, int amount);

    String withdraw(Customer customer, int amount);

}
