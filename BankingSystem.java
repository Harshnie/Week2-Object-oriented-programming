import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public String getAccountDetails() {
        return "Account No: " + accountNumber + ", Holder: " + holderName + ", Balance: Rs." + balance;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {}

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {}

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA001", "Anu", 8000));
        accounts.add(new CurrentAccount("CA002", "Banu", 15000));

        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
            System.out.println("Interest: Rs." + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanable = (Loanable) acc;
                System.out.println("Loan Eligible: " + loanable.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}
