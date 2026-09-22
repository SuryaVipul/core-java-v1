package MultiThreading.locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/* Reentrant Lock doesn't depend on a one obj, it just depend on a lock
 and we are passing a same lock. so synchronized does not work here because
 it works on a same object. */

public class Main {

	public static void main(String[] args) {
		
		ReentrantLock lock = new ReentrantLock();
		
		SharedResource resource1 = new SharedResource();
		Thread th1 = new Thread(() -> {
			resource1.producer(lock);
		});
		
		SharedResource resource2 = new SharedResource();
		Thread th2 = new Thread(() -> {
			resource2.producer(lock);
		});
	
		th1.start();
		th2.start();
	}

}
