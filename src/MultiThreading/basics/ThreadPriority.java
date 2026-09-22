package MultiThreading.basics;

class SimpleThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread();
        SimpleThread t2 = new SimpleThread();

        t1.setName("HighPriorityThread");
        t2.setName("LowPriorityThread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
