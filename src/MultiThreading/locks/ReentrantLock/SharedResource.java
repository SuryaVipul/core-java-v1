package MultiThreading.locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
	boolean isAvailble = false;
	
	public void producer(ReentrantLock lock) {
		try {
			lock.lock();
			System.out.println("Lock acquired by: "+Thread.currentThread().getName());
			isAvailble = true;
			Thread.sleep(4000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			lock.unlock(); // release the lock
			System.out.println("Lock released by: "+Thread.currentThread().getName());
		}
	}
}
