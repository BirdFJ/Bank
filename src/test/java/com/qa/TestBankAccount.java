package com.qa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {
    @Test
    public void test_opening_balance_not_under_50() {

//      Arrange
        double openingBal = 50;
        double expectedOpeningBal = 50;

//      Assert
        assertTrue(openingBal >= expectedOpeningBal);
    }


    @Test
    public void deposit_50_into_account() {
//      Arrange
        BankAccount account = new BankAccount(0.0, 50.0,"Gary Gary ");
        double amount = 50.0;
        double expectedBalance = 50.0;

//      Act
        account.deposit(amount);
        double actualBalance = account.getBalance();

//      Assert
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void test_withdraw_not_negative() {

        double amount = 20.80;
        assertTrue(amount > 0);
    }

    @Test
    public void test_withdraw_50_from_account() {
//      Arrange
        BankAccount account = new BankAccount(100.0, 50.0, "Person Name");
        double amount = 50.0;
        double expectedBalance = 50.0;

//      Act
        account.withdraw(amount);
        double actualBalance = account.getBalance();

//      Assert
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void test_savings_should_add_5pc_to_balance() {
        // Arrange
        SavingsAccount savingsAccount = new SavingsAccount(100.0, 50.0, "Saver");
        savingsAccount.setInterestRate(1.05);
        double expectedSavings = 105.0;

        //Act
        savingsAccount.setSavingsBalance(SavingsAccount.getBalance());
        double actualSavings = SavingsAccount.getBalance();

        //Assert
        assertEquals(expectedSavings, actualSavings);
    }

    @Test
    public void test_balance_below_minimum() {
        BankAccount account = new BankAccount(100.0, 50.0, "Peter Parker");
        if (account.getBalance() < account.getMinimumBalance()) {
            assertThrows(IllegalArgumentException.class, (Executable) account);
        }
    }

    @Test
    public void test_current_account_withdraw_over_limit150(){
    // arrange
        CurrentAccount currentAccount = new CurrentAccount(250.0, 50.0, "Jane Doe");
        double maxAmount = 100.0;
        double withdrawAmount = 150.0;
        currentAccount.setMaximumWithdraw(maxAmount);

        currentAccount.withdraw(withdrawAmount);

    }

}
