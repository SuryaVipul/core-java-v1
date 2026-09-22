package MultiThreading.basics;

class SleepExample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i ++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadSleepExample {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread1 = new Thread(new SleepExample());
//        thread1.start();
//        Thread thread2 = new Thread(new SleepExample());
//        thread2.start();

        // run method with thread
//        Thread thread3 = new Thread(new SleepExample());
//        thread3.run();
//        Thread thread4 = new Thread(new SleepExample());
//        thread4.run();

//        for (int i = 0; i < 5; i++ ){
//            System.out.println(i + " " + Thread.currentThread().getName());
//            Thread.sleep(1000);
//        }



        Thread thread = new Thread(() -> {
            System.out.println("Thread will sleep for 5 seconds");
            try {
                Thread.sleep(5000);
                System.out.println("Thread woke up after sleep...");
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread was interrupted during sleep.");
            }
        });

        thread.start();

        System.out.println("Main thread sleep starts here...");
        System.out.println("Start : " + System.currentTimeMillis());
        Thread.sleep(9000); //  main thread for 9 seconds
        System.out.println("Thread woke up after 9 seconds");
        System.out.println("End   : " + System.currentTimeMillis());
     //   thread.interrupt(); // interrupt the sleeping thread
    }
}
