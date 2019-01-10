package com.NuBank;

public class Account {
    //declare variable with access modifier public
    private String accountNumber;
    private String accountName;
    protected double balance;
    //computer provide default constructor if we do not write explicitly write

    //constructor


    public Account(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        if(accountNumber != null) {
            if (accountNumber.trim().contentEquals("")) {
                throw new RuntimeException("Please provide correct number.");
            } else if ((accountNumber.trim()).length() < 7) {
                throw new RuntimeException("Account number must be equal or greater than 7 digits.");
            } else {
                this.accountNumber = accountNumber;
            }
        } else {
            throw new NullPointerException("Account number can not be null.");
        }
    }
    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public  double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount <= 0){
            throw new RuntimeException("Invalid amount");
        } else {
            balance = balance + amount;
        }
    }


    public void withdraw(double amount){
        if(amount <= 0) {
            throw new RuntimeException("It's not a valid amount.");
        } else if(amount > balance){
            throw  new RuntimeException("not a sufficient balance");
        } else {
            balance = balance - amount;
        }
    }

}
