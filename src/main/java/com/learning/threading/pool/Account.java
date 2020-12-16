package com.learning.threading.pool;

public class Account {

    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amt){
        balance += amt;
    }

    public void withdraw(int amt){
        balance -= amt;
    }

    public static void transfer(Account account1, Account account2, int amount){
        account1.withdraw(amount);
        account2.deposit(amount);
    }
}
