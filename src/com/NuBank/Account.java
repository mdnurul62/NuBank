package com.NuBank;

public class Account {
    //declare variable with access modifier public
    private String accountNumber;
    private String accountName;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountName(){
        return accountName = "Nurul";
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public  double getBalance(){
        return balance = 2000.00;
    }


}
