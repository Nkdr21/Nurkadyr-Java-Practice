package main;

public class BankAccount {
    private String owner;
    private double balance;

    // constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Get money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Not enough money on account!");
        }
    }

    // Issuing account information
    public void printInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------");
    }
}
