package MultiThreading.sharedresource;

public class ProduceTask implements Runnable{
	SharedResource sharedResource;
	
	public ProduceTask(SharedResource resource) {
		this.sharedResource = resource;
	}

	@Override
	public void run() {
		System.out.println("Producer thread: "+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			// handle exception here
		}
		sharedResource.addItem();
	}
	
}
