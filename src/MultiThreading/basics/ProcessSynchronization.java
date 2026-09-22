package MultiThreading.basics;

class BankAccount {
    // Shared resource (bank balance)
    private int balance = 1000;

    // Synchronized method for deposit operation
    public synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: "+ amount + ", Balance: " + balance);
    }

    // Synchronized method for withdrawal operation
    public synchronized void withdraw(int amount) {

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw: "+ amount + ", Balance: " + balance);
        }
        else {
            System.out.println( "Insufficient balance to withdraw: "+ amount);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class ProcessSynchronization {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();  // Shared resource

        // Thread 1 to deposit money into the account
        Thread thread1 = new Thread(() -> {
           for (int i = 0; i < 3; i++){
               account.deposit(200);
               try {
                   Thread.sleep(50);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        // Thread 2 to withdraw money into the account
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++){
                account.withdraw(100);
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // Print final balance
        System.out.println("Final Balance: "
                + account.getBalance());
    }
}
