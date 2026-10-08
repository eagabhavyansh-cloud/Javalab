

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accNo = sc.nextLine().trim();
        String name = sc.nextLine().trim();
        double initialBalance = Double.parseDouble(sc.nextLine().trim());
        double depositAmount = Double.parseDouble(sc.nextLine().trim());
        double withdrawAmount = Double.parseDouble(sc.nextLine().trim());

        BankAccount account = new BankAccount(accNo, name, initialBalance);

        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
        account.displayAccount();

        sc.close();
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + checkBalance());
    }
}
