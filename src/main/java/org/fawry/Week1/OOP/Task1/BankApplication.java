package org.fawry.Week1.OOP.Task1;

import java.util.Scanner;

public class BankApplication {
    private static final String USUAL_PROMPT = "Enter the account ID: ";
    public static double getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        String inputString;
        double inputDouble;
        if(!prompt.isEmpty()) System.out.print(prompt);
        do {
            inputString = input.nextLine();
            try {
                inputDouble = Double.parseDouble(inputString);
                if(inputDouble < 0.0)
                    throw new Exception("***********************\nValue must be positive\n***********************");
                break;
            } catch (NumberFormatException e) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Invalid input, please enter a valid one");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (true);

        return inputDouble;
    }

    public static void openSavingAccount(Bank bank) {
        Scanner input = new Scanner(System.in);
        System.out.print(USUAL_PROMPT);
        String accountID = input.nextLine();
        System.out.print("Enter the account holder name: ");
        String accountHolderName = input.nextLine();
        double accountBalance = getInput("Enter the initial balance: ");
        double interestRate = getInput("Enter the interest rate: ");
        SavingsAccount savingsAccount = new SavingsAccount(accountID, accountHolderName, accountBalance, interestRate);

        try {
            bank.addAccount(savingsAccount);
            System.out.println("**********************************");
            System.out.println("Added account '" + accountID + "' to the bank");
            System.out.println("**********************************");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void depositMoney(Bank bank) {
        Scanner input = new Scanner(System.in);
        System.out.print(USUAL_PROMPT);
        String accountID = input.nextLine();
        double amount = getInput("Enter the amount to deposit: ");

        try {
            bank.deposit(accountID, amount);
            System.out.println("-------------------- Deposit --------------------");
            System.out.println("Deposited " + amount + " to account '" + accountID + "' successfully !!");
            System.out.println("-------------------------------------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdrawMoney(Bank bank) {
        Scanner input = new Scanner(System.in);
        System.out.print(USUAL_PROMPT);
        String accountID = input.nextLine();
        double amount = getInput("Enter the amount to withdraw: ");

        try {
            bank.withdraw(accountID, amount);
            System.out.println("------------------ Withdraw ------------------");
            System.out.println("Withdrew " + amount + " from account " + accountID);
            System.out.println("---------------------------------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void viewBalance(Bank bank) {
        Scanner input = new Scanner(System.in);
        System.out.print(USUAL_PROMPT);
        String accountID = input.nextLine();

        try {
            bank.displayBalance(accountID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showNumberOfAccounts(Bank bank) {
        System.out.println("******************************************");
        System.out.println("The Number of accounts in the system is: " + bank.getNumberOfAccounts());
        System.out.println("******************************************");
    }

    public static void showAccountInfo(Bank bank) {
        Scanner input = new Scanner(System.in);
        System.out.print(USUAL_PROMPT);
        String accountID = input.nextLine();

        try {
            bank.displayInfo(accountID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        while (true) {
            System.out.println("Welcome to the bank application");
            System.out.println("1. Open a savings account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View balance");
            System.out.println("5. Show the Number of accounts in the System");
            System.out.println("6. Show the info of a specific account");
            System.out.println("0. Exit");
            System.out.print("\nPlease choose an option [0 : 6]: ");

            int option = (int) getInput("");

            if(option >= 0 && option <= 6) {
                if (option == 1)
                    openSavingAccount(bank);

                else if (option == 2)
                    depositMoney(bank);

                else if (option == 3)
                    withdrawMoney(bank);

                else if (option == 4)
                    viewBalance(bank);

                else if (option == 5)
                    showNumberOfAccounts(bank);

                else if (option == 6)
                    showAccountInfo(bank);

                else break;
            }
        }

        System.out.println("Thank you for using our bank application :)");
    }
}