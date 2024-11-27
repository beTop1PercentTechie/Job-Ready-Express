package controllers;

import models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(String accountNumber, String accountHolder, double initialBalance) {
        Account newAccount = new Account(accountNumber, accountHolder, initialBalance);
        accounts.add(newAccount);
        return newAccount;
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}
