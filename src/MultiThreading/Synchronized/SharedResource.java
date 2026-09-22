package MultiThreading.Synchronized;

public class SharedResource {
	
	boolean isAvailable = false;
	
	public synchronized void producer() {
		try {
			System.out.println("Lock acquired by: "+ Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(4000);
		}
		catch(Exception e) {
			
		}
		System.out.println("Lock release by: "+ Thread.currentThread().getName());
	}
}
