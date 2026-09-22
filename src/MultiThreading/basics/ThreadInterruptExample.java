package MultiThreading.basics;

class ChildThread2 implements Runnable  {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
                System.out.println("Child Thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread Interrupt here :- "+e);
            }
        }
    }
}

public class ThreadInterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new ChildThread2());
        thread.start();
       thread.interrupt();
    }
}
