import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double minbalance;

    public void deposit(double amount) {
        if (amount > 0) {
            minbalance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= minbalance) {
            minbalance -= amount;
            System.out.println("Withdrew amount: Rs. " + amount);
        } else {
            System.out.println("Insufficient Balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: Rs. " + minbalance);
    }
}

public class atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BankAccount account = new BankAccount();
		
        System.out.print("Enter account holder name: ");
        account.accountHolder = scan.nextLine();

        System.out.print("Enter account number: ");
        account.accountNumber = scan.nextInt();
        scan.nextLine(); 

        account.minbalance = 1000.0; 

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("Enter the deposit amount: ");
                double depositamt = scan.nextDouble();
                account.deposit(depositamt);
            } else if (choice == 2) {
                System.out.print("Enter the amount to be withdrawn: ");
                double withdrawamt = scan.nextDouble();
                account.withdraw(withdrawamt);
            } else if (choice == 3) {
                account.displayBalance();
            } else if (choice == 4) {
                System.out.println("Thank you for using our ATM.");
                scan.close();
                break;
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }
    }
}
