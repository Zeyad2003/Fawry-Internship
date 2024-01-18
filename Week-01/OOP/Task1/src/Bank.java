package src;

import java.util.*;

/**
 * A class that represents a bank that stores and manages multiple accounts.
 */
public class Bank {

    private final ArrayList<Account> accounts;
    private static int numberOfAccounts;

    /**
     * A default constructor that creates an empty bank with an initial capacity of 10 accounts.
     */
    public Bank() {
        accounts = new ArrayList<>();
    }

    /**
     * A method that adds a new account to the bank if it does not already exist.
     *
     * @param account the account to be added
     * @throws Exception if the account does not exist
     */
    public void addAccount(Account account) throws Exception {
        try {
            validateAddAccount(account.getAccountID());
            numberOfAccounts++;
            accounts.add(account);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * A method that deposits a given amount of money to a specific account in the bank.
     *
     * @param accountID the number of the account to deposit to
     * @param amount    the amount of money to deposit
     * @throws Exception if the account does not exist
     */
    public void deposit(String accountID, double amount) throws Exception {
        try {
            Account account = getExistAccount(accountID);
            account.deposit(amount);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * A method that withdraws a given amount of money from a specific account in the bank.
     *
     * @param accountID the number of the account to withdraw from
     * @param amount    the amount of money to withdraw
     * @throws Exception if the account does not exist
     */
    public void withdraw(String accountID, double amount) throws Exception {
        try {
            Account account = getExistAccount(accountID);
            account.withdraw(amount);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * A method that return the number of accounts in the bank.
     *
     * @return the number of accounts in the bank
     */
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    /**
     * A method that displays the balance and interest (if applicable) of a specific account in the bank.
     *
     * @param accountID the number of the account to display balance for
     * @throws Exception if the account does not exist
     */
    public void displayBalance(String accountID) throws Exception {
        try {
            getExistAccount(accountID);
            Account account = getExistAccount(accountID);
            System.out.println("******************** Balance ********************");
            System.out.println("The balance of account " + account.getAccountID() + " is " + String.format("%.2f",
                    account.getBalance()));

            SavingsAccount savingsAccount = (SavingsAccount) account;
            System.out.println("The interest on this savings account is " + String.format("%.2f",
                    savingsAccount.getInterestRate()));

            System.out.println("*************************************************");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * A method the show the info of a specific account in the bank.
     * The info includes the account number, balance, and interest (if applicable).
     *
     * @param accountID the number of the account to display info for.
     * @throws Exception if the account does not exist.
     */
    void displayInfo(String accountID) throws Exception {
        try {
            Account account = getExistAccount(accountID);
            account.showAccountInfo();
            SavingsAccount savingsAccount = (SavingsAccount) account;
            System.out.println("The interest on this savings account is " + String.format("%.2f",
                    savingsAccount.getInterestRate()));
            System.out.println("**************************************************");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * A private helper method that finds an account in the bank by its number and returns it or null if not found.
     *
     * @param accountID the number of the account to find
     * @return the account with the given number or null if not found
     */
    private Account findAccount(String accountID) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountID(), accountID)) {
                return account;
            }
        }
        return null;
    }

    /**
     * A private helper method that returns an account if it exists or throws an exception if not.
     *
     * @param accountID the number of the account to find
     * @return the account with the given number
     * @throws Exception if the account does not exist
     */
    public Account getExistAccount(String accountID) throws Exception {
        Account account = findAccount(accountID);
        if (account == null)
            throw new Exception("**********************\nAccount Does Not Exist\n**********************");
        return account;
    }


    /**
     * A private helper method that validates the addition of a new account.
     *
     * @param accountID the number of the account to validate
     * @throws Exception if the account already exists
     */
    private void validateAddAccount(String accountID) throws Exception{
        if (findAccount(accountID) != null)
            throw new Exception("*********************\nAccount Already Exist\n*********************");
    }
}
