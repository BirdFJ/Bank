
package com.qa;

public class CurrentAccount extends BankAccount{
    private double maximumWithdraw;

    public double getMaximumWithdraw() {return maximumWithdraw;}

    public void setMaximumWithdraw(double maximumWithdraw) {
        this.maximumWithdraw = maximumWithdraw;}

    public CurrentAccount(double balance, double minimumBalance, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);

    }
    public double withdraw(double num) {
        if (num > maximumWithdraw) {
            System.out.println("Can not withdraw over £" + maximumWithdraw + " please visit a branch.");
        } else {
            balance -= num;
        }
        return balance;
    }
}
