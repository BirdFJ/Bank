package com.qa;

public class BankAccount {

    public static double balance;
    private double minimumBalance;
    private String accountHolderName;

    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        super();
        if(balance < minimumBalance){
            throw new IllegalArgumentException("You do not have sufficient funds.");
            // need to add test that deal with this exception - assertThrows
        }
        this.setBalance(balance);
        //this.setMinimumBalance(minimumBalance);
        //this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }


    public double getMinimumBalance() {return minimumBalance;}

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;}


    public static double getBalance() {return balance;}
    public void setBalance(double b) {balance = b;}

    //public void setSavingsBalance(double balance) {this.balance = balance *= 1.05;}

    public static double deposit(double num) {balance += num; return balance;}

    public double withdraw(double num) {
        balance -= num; return balance;
    }

    public void aboutAccount(){
        System.out.println("The account holder name is " + this.accountHolderName);
        System.out.println("The account balance of " + this.accountHolderName + " is £" + this.getBalance());
    }

}
