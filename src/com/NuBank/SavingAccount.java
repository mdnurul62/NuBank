package com.NuBank;

public class SavingAccount extends Account {
    @Override
    public void deposit(double amount){
        if(amount <= 0){
            throw new RuntimeException("Invalid amount");
        } else {
            balance = balance + amount + 0.10*amount;
        }
    }
    @Override
    public void withdrawal(double amount){

        super.withdrawal(amount);
        super.withdrawal(amount*0.05);
//        if(amount <= 0) {
//            throw new RuntimeException("It's not a va9lid amount.");
//        } else if(amount > balance){
//            throw  new RuntimeException("not a sufficient balance");
//        } else {
//            balance = balance - amount - 0.05*amount;
//        }
    }
}
