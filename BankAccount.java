class BankAccount {
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "John ", 5000.00);
        BankAccount account2 = new BankAccount(1002, "Smith", 3000.00);

        BankAccount.getTotalAccounts();

        if (account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }

        if (account2 instanceof BankAccount) {
            account2.displayAccountDetails();
        }
    }
}
