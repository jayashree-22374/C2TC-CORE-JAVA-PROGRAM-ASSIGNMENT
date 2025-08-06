package com.jayashree.assignment3;

public abstract class Account {
	protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        Bank.incrementAccounts(); // Increment when a new account is created
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
    
    class SavingsAccount extends Account {
        public SavingsAccount(String accountHolder, double balance) {
            super(accountHolder, balance);
        }
        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Savings Account.");
        }

        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " from Savings Account.");
            } else {
                System.out.println("Insufficient balance in Savings Account.");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }

    }
    
    class CheckingAccount extends Account {
        public CheckingAccount(String accountHolder, double balance) {
            super(accountHolder, balance);
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Checking Account.");
        }
        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " from Checking Account.");
            } else {
                System.out.println("Insufficient balance in Checking Account.");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        } 

    }
}




