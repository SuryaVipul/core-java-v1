package MultiThreading.basics;

class Counter1 {
    int count = 0;

    public synchronized void increment(){
        count++;
    }
    public synchronized  int getCount() {
        return count;
    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter1 = new Counter1();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter1.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count "+ counter1.getCount());
    }
}
