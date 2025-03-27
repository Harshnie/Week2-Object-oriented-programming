class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit Rs." + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositTerm; 

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

public class BankAccountHierarchy {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA1", 5000.00, 3.5);
        savings.displayAccountDetails();
        savings.displayAccountType();

        CheckingAccount checking = new CheckingAccount("CA2", 2500.00, 1000.00);
        checking.displayAccountDetails();
        checking.displayAccountType();

        FixedDepositAccount fixed = new FixedDepositAccount("FD3", 10000.00, 12);
        fixed.displayAccountDetails();
        fixed.displayAccountType();
    }
}
