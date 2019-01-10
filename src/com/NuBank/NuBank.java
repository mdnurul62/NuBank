package com.NuBank;

public class NuBank {
    public static void main(String[] args){


        //test output
        System.out.println("*******Welcome to bank NuBank*****");

        //declare a variable
//        Account myAccount;
        //create an instance of Account
        Account myAccount = new Account("12345678", "Nurul", 1000.0);
        //create second instance
        SavingAccount yourAccount = new SavingAccount("123456789", "Alam", 100000);

//        myAccount.getAccountName();
//        myAccount.setAccountName("Nurul");
//        myAccount.getAccountNumber();
//        myAccount.setAccountNumber("12345678");
        myAccount.deposit(1110);
        myAccount.withdraw(200.0);
        myAccount.getBalance();
        System.out.println("******************************************************");
        System.out.println("Name of account holder: " + myAccount.getAccountName());
        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());

// Second account
        System.out.println("\n***********************************************");

//        yourAccount.getAccountName();
//        yourAccount.setAccountName("Alam");
//        yourAccount.getAccountNumber();
//        yourAccount.setAccountNumber("123456789");
        yourAccount.deposit(100000.0);
        yourAccount.withdraw(20000.0);
        yourAccount.getBalance();

        System.out.println("Name of account holder: " + yourAccount.getAccountName());
        System.out.println("Account number: " + yourAccount.getAccountNumber());
        System.out.println("Balance: " + yourAccount.getBalance());
        System.out.println("******************************************************");
    }
}
