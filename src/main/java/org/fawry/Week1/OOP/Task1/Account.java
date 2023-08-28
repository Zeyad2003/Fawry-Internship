package org.fawry.Week1.OOP.Task1;

/**
 * A class that represents a bank account with basic features such as deposit, withdraw, and show account info.
 */
public class Account {
    private final String accountID;
    private final String accountHolderName;
    private double accountBalance;

    /**
     * A constructor that creates an account with the given number, name, and balance.
     *
     * @param accountID         the ID of the account
     * @param accountHolderName the name of the account holder
     * @param accountBalance    the initial balance of the account
     */
    public Account(String accountID, String accountHolderName, double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountID = accountID;
        this.accountHolderName = accountHolderName;
    }

    /**
     * A method that deposits a given amount of money to the account and prints a confirmation message.
     *
     * @param amount the amount of money to deposit
     * @throws IllegalArgumentException if the amount is negative
     */
    public void deposit(double amount) {
        if (amount > 0)
            accountBalance += amount;
        else
            throw new IllegalArgumentException("Amount must be positive");

    }

    /**
     * A method that withdraws a given amount of money from the account and prints a confirmation message.
     *
     * @param amount the amount of money to withdraw
     * @throws IllegalArgumentException if the amount is negative or greater than the balance
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            throw new IllegalArgumentException("********************\nInsufficient balance\n********************");
        }
    }

    /**
     * A method that shows the information of the account, such as number, name, and balance.
     */
    public void showAccountInfo() {
        System.out.println("****************** Account Info ******************");
        System.out.println("Account number: " + accountID);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    /**
     * A method that returns the ID of the account.
     *
     * @return the ID of the account
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * A method that returns the balance of the account.
     *
     * @return the balance of the account
     */
    public double getBalance() {
        return accountBalance;
    }
}
