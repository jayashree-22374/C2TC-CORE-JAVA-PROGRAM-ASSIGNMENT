package com.jayashree.assignment3;

public class Transaction {
	private final double transactionFee = 10.0;

    public final void performTransaction(Account from, Account to, double amount) {
        System.out.println("\nInitiating transaction of " + amount + " with fee " + transactionFee);
        if (from.getBalance() >= (amount + transactionFee)) {
            from.withdraw(amount + transactionFee);
            to.deposit(amount);
            System.out.println("Transaction Successful.");
        } else {
            System.out.println("Transaction Failed: Insufficient funds including transaction fee.");
        }
    }

    public double getTransactionFee() {
        return transactionFee;
    }

}


