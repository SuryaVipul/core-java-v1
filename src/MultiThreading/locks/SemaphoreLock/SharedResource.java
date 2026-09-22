package MultiThreading.locks.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {
	
	boolean isAvailable = false;
	Semaphore lock = new Semaphore(2); // this meanse 2 threads are permitted to acquire a lock at the same time
	
	public void producer() {
		
		try {
			lock.acquire();
			System.out.println("Lock acquired by: "+ Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(4000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			lock.release();
			System.out.println("Lock released by: "+ Thread.currentThread().getName());
		}
	}
}
