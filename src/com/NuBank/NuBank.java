package com.NuBank;

public class NuBank {
    public static void main(String[] args){


        //test output
        System.out.println("*******Welcome to bank NuBank*****");

        //declare a variable
        Account myAccount;
        //create an instance of Account
        myAccount = new Account();
        //create second instance
        SavingAccount yourAccount = new SavingAccount();

//        myAccount.getAccountName();
        myAccount.setAccountName("Nurul");
//        myAccount.getAccountNumber();
        myAccount.setAccountNumber("12345678");
        myAccount.deposit(1110);
//        myAccount.withdrawal(2000.0);
        myAccount.getBalance();
        System.out.println("******************************************************");
        System.out.println("Name of account holder: " + myAccount.getAccountName());
        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());

// Second account
        System.out.println("\n***********************************************");

//        myAccount.getAccountName();
        yourAccount.setAccountName("Alam");
//        myAccount.getAccountNumber();
        yourAccount.setAccountNumber("123456789");
        yourAccount.deposit(100000.0);
//        myAccount.withdrawal(20000.0);
        yourAccount.getBalance();

        System.out.println("Name of account holder: " + yourAccount.getAccountName());
        System.out.println("Account number: " + yourAccount.getAccountNumber());
        System.out.println("Balance: " + yourAccount.getBalance());
        System.out.println("******************************************************");
    }
}
