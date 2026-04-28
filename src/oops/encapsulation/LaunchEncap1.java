package oops.encapsulation;

class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        if (!(accountNumber <= 0)) {
            this.accountNumber = accountNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid account Number");
        }
        if (!(accountHolderName.isEmpty() || accountHolderName == null)) {
            this.accountHolderName = accountHolderName;
        }
        else {
            throw new IllegalArgumentException("Invalid Name");
        }
        if (balance < 0) {
            this.balance = 0;
        }
        else {
            this.balance = balance;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid deposit amount");
        else {
            balance += amount;
            System.out.println("Amount deposited successfully");
            System.out.println("Updated balance is -: " + this.getBalance());
        }
    }

    public void withdraw(double amount){
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid withdraw amount");
        else if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance");
        else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Updated balance is -: " + this.getBalance());
        }
    }

    public void display() {
        System.out.println("Account Number -: " + this.getAccountNumber());
        System.out.println("Account Holder -: " + this.getAccountHolderName());
        System.out.println("Balance -: " + this.getBalance());
    }

    public void transfer(BankAccount target, double amount)  {
        if (amount <= 0 )
            throw new IllegalArgumentException("Invalid amount");

        if (amount > this.balance)
            throw new IllegalArgumentException("Invalid balance");

        this.balance -= amount;
        target.balance += amount;

        System.out.println("Transfer Successfull..");

        System.out.println("Updated Balance is :- "+ target.getBalance());
    }
}

public class LaunchEncap1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Surya", 50000);
        BankAccount acc2 = new BankAccount(102, "Aman", -2000);

        acc1.deposit(15000);
        //acc1.deposit(0);
        acc1.withdraw(3000);
        //acc1.withdraw(0);

        acc2.deposit(20000);
        acc2.withdraw(4000);
        acc2.transfer(acc1,7000);
        System.out.println("*****************************************");
    }
}
