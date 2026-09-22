package MultiThreading.monitorlock;

// MonitorLock :- It helps to make sure only 1 thread goes inside the particular section 
// of the code (a synchronized block or method)

public class MonitorLockExample {

	public synchronized void task1() {
		try {
			System.out.println("Inside task1");
			Thread.sleep(5000);
			System.out.println("task1 completed");
		} catch (Exception e) {
			System.out.println("Exception in task1");
		}
	}

	public void task2() {
		System.out.println("task2, but befor synchronized");
		synchronized (this) {
			System.out.println("task2, inside synchronized");
		}
	}

	public void task3() {
		System.out.println("task3");
	}

	public static void main(String[] args) {

		MonitorLockExample obj = new MonitorLockExample();

		Thread t1 = new Thread(() -> obj.task1());
		Thread t2 = new Thread(() -> obj.task2());
		Thread t3 = new Thread(() -> obj.task3());

		t1.start();
		t2.start();
		t3.start();
	}

}
