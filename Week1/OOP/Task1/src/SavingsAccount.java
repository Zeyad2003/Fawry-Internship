package src;

/**
 * A class that represents a savings account that inherits from the Account class and has an additional interest rate field and method.
 */
public class SavingsAccount extends Account {
    private final double interestRate;

    /**
     * A constructor that creates a savings account with the given number, name, balance, and interest rate.
     *
     * @param accountID     the ID of the account
     * @param accountHolderName the name of the account holder
     * @param balance           the initial balance of the account
     * @param interestRate      the annual interest rate of the savings account
     */
    public SavingsAccount(String accountID, String accountHolderName, double balance, double interestRate) {
        super(accountID, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    /**
     * A method that calculates and returns the interest on the balance of the savings account.
     *
     * @return the interest on the balance of the savings account
     */
    public double getInterestRate() {
        return getBalance() * interestRate / 100.0f;
    }
}
