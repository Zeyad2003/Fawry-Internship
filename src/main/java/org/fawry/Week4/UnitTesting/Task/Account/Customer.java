package org.fawry.Week4.UnitTesting.Task.Account;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private int balance;
    private boolean creditAllowed;
    private int maxCredit = 0;
    private boolean vip;

}
