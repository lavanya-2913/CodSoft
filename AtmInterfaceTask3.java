import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds, Withdrawal failed.");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}

public class AtmInterfaceTask3{
    private BankAccount userAccount;

    public AtmInterfaceTask3(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        AtmInterfaceTask3 atm = new AtmInterfaceTask3(userAccount);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            System.out.print("Select any process: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    if (atm.userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Remaining balance: " + atm.userAccount.getBalance());
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.userAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. Updated balance: " + atm.userAccount.getBalance());
                    break;
                case 3:
                    System.out.println("Current Balance: " + atm.userAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting ATM Interface. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
