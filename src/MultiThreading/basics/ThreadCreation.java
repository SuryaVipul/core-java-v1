package MultiThreading.basics;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread class current state -> "+ Thread.currentThread().getState());
        System.out.println("MyThread class is running");

        for (int i = 0; i < 4; i++) {
            System.out.println("MyThread count: " + i);
            if (i == 2){
                try {
                    System.out.println("MainThread currently inside sleep state");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("MyThread InterruptedException occurs");
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable class current state -> "+ Thread.currentThread().getState());
        System.out.println("MyRunnable class is running");

        for (int i = 0; i < 4; i++) {
            System.out.println("MyRunnable count: " + i);
            if (i == 2){
                try {
                    System.out.println("MyRunnable currently inside sleep state");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("MyRunnable InterruptedException occurs");
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class TestSleepMethod1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}

public class ThreadCreation {

    public static void main(String[] args) {
        System.out.println("Main thread Current State -> "+ Thread.currentThread().getState());
//        MyThread t1 = new MyThread();
//        t1.start();
//        System.out.println(t1.getPriority());
//
//        System.out.println("---------------------------------------------------------------");
//
//        Thread thread = new Thread(new MyRunnable());
//        thread.start();
//        System.out.println(thread.getPriority());

//        TestSleepMethod1 t1 = new TestSleepMethod1();
//        TestSleepMethod1 t2 = new TestSleepMethod1();
//      //  t1.run();
//        t1.start();
//        t2.start();

        // How multiple threads are executing simultaneously
        for (int i = 0; i < 4; i++) {
            Task t1 = new Task();
            Thread thread = new Thread(t1);
            thread.start();
        }
    }
}
