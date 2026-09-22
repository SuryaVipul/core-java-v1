package MultiThreading.basics;

class ThreadMethodsExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread task is executed by : "+Thread.currentThread().getName()); // this thread name is created by JVM called -> Thread-0
    }
}

public class MethodsOfThreadClass {
    public static void main(String[] args) {
        // this is a main thread
        ThreadMethodsExample tme1 = new ThreadMethodsExample();
        tme1.start(); // this thread is created by main thread
        ThreadMethodsExample tme2 = new ThreadMethodsExample();
        tme2.start();
     //   Thread.currentThread().setName("main Thread Name ");
        System.out.println("hello is printed by : " + Thread.currentThread().getName());  // this thread name is created by JVM called -> Main
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(tme1.isAlive());
        System.out.println(tme2.isAlive());

    }
}
