package com.NuBank;

public class SavingAccount extends Account {
    //constructor cannot inherit
    //constructor
    public SavingAccount(String accountNumber, String accountName, double balance) {
        super("123456789", "Alam", 10000.0);
    }


    @Override
    public void deposit(double amount){
        if(amount <= 0){
            throw new RuntimeException("Invalid amount");
        } else {
            balance = balance + amount + 0.10*amount;
        }
    }
//    @Override
//    public void withdraw(double amount){
//
//        super.withdraw(amount);
//        double charges = amount*0.01;
//        super.withdraw(charges);
//        if(amount <= 0) {
//            throw new RuntimeException("It's not a va9lid amount.");
//        } else if(amount > balance){
//            throw  new RuntimeException("not a sufficient balance");
//        } else {
//            balance = balance - amount - 0.01*amount;
//        }
//    }
    @Override
    protected double getCharges(double amount){
        double charges = amount * 0.05;
        return charges;
    }
}
