package MultiThreading.basics;

class Medical implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Medical starts");
            Thread.sleep(1000);
            System.out.println("Medical completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TestDrive implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("TestDrive starts");
            Thread.sleep(1000);
            System.out.println("TestDrive completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class OfficerSign implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Officer takes the file");
            Thread.sleep(1000);
            System.out.println("Officer work completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class LicenceDemoJoin {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Medical());
        thread1.start();
        thread1.join();

        Thread thread2 = new Thread(new TestDrive());
        thread2.start();
        thread2.join();

        Thread thread3 = new Thread(new OfficerSign());
        thread3.start();
        thread3.join();

    }
}
