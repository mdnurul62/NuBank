package com.NuBank;

public class NuBank {
    public static void main(String[] args){


        //test output
        System.out.println("*******Welcome to bank NuBank*****");

        //declare a variable
        Account myAccount;
        //create an instance of Account
        myAccount = new Account();

        myAccount.getAccountName();
        myAccount.setAccountName("Nurul");
        myAccount.getAccountNumber();
        myAccount.setAccountNumber("12345");
        myAccount.getBalance();

        System.out.println("Name of account holder: " + myAccount.getAccountName());
        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());
    }
}
