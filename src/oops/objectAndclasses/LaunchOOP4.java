package oops.objectAndclasses;

class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            System.out.println("Invalid deposit amount");
        else {
            balance += amount;
            System.out.println("Amount deposited successfully");
            System.out.println("Updated balance is -: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid withdraw amount");
        else if (amount > balance)
            System.out.println("Insufficient balance");
        else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Updated balance is -:" + balance);
        }
    }

    public void display() {
        System.out.println("Account Holder -: " + accountHolderName);
        System.out.println("Balance -: " + balance);
    }
}

public class LaunchOOP4 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(01232, "Surya", 50000);
         bankAccount.deposit(0);
        bankAccount.deposit(10000);
        bankAccount.withdraw(0);
       bankAccount.withdraw(75000);
        bankAccount.withdraw(12000);
        bankAccount.display();

    }
}
