package MultiThreading.basics;

public class MainThreadJoin implements Runnable {
    static Thread mainThread;
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                mainThread.join();
                Thread.sleep(1000);
                System.out.println("Child Thread "+ i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
         mainThread = Thread.currentThread();
        Thread thread = new Thread(new MainThreadJoin());

        thread.start();

        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Main Thread "+ i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
