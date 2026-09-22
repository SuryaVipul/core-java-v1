package MultiThreading.basics;

// In this example we are using lambda function which will internally implement and override run() method of thread class

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread userThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("User Thread " + i);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread daemonThread = new Thread(() -> {
            try {
                for (int i = 0; i < 8; i++) {
                    System.out.println("Daemon Thread " + i);
                    Thread.sleep(2000);
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        userThread.start();
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println(daemonThread.isDaemon());

        // The main point here is if we there are two threads UserThread and Daemon Thread
        //Once userThread execution is done JVM will not wait for DeamonThread to complete it will terminate the
        // Daemon thread execution.
        // If Daemon thread set to false then it will be act as normal Userthread not Daemon thread.
    }
}
