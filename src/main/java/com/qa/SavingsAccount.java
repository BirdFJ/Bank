package com.qa;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public double getInterestRate() {return interestRate;}

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;}


    public SavingsAccount(double balance, double minimumBalance, String accountHolderName){
        super(balance, minimumBalance, accountHolderName);
    }

    public void setSavingsBalance(double balance) {
        this.balance = balance *= interestRate;
    }

}
