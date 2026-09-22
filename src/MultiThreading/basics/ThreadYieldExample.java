package MultiThreading.basics;

class Numbers implements Runnable {
    @Override
    public void run() {
        Thread.yield();
        for (int i = 0; i < 5; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

class Stars implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("* " + Thread.currentThread().getName());
        }
    }
}

public class ThreadYieldExample {
    public static void main(String[] args) {
        Thread numbers = new Thread(new Numbers());
        numbers.start();
        Thread stars = new Thread(new Stars());
        stars.start();

        Thread.yield();
        for (int i = 0; i < 5; i++){
            System.out.println("a " + Thread.currentThread().getName());
        }
    }
}
