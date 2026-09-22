package MultiThreading.basics;


class ChildThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Child Thread "+ i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ChildThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ChildThread());

        thread.start();

        thread.join();

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
