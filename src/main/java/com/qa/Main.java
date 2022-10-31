package com.qa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankAccount janeAccount = new BankAccount(500.0, 50.0, "Jane Doe");
        SavingsAccount johnAccount = new SavingsAccount(2700.0, 100.0, "John Doe");
        List<BankAccount> accounts= new ArrayList<>();
        accounts.add(janeAccount);
        accounts.add(johnAccount);
        System.out.println(janeAccount.getBalance());
        for(BankAccount account: accounts){
            account.aboutAccount();
        }
    }
}
