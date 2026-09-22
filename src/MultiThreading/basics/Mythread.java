package MultiThreading.basics;

// extending Thread Class
class ThreadLearning extends Thread{
	@Override
	public void run() {
		//System.out.println("Thread start Running successfully using Thread.");
//		for(int i = 0; i < 5; i++) {
//			System.out.println(Thread.currentThread().getName() + " - Count: "+i);
//			try {
//				Thread.sleep(3000);
//			}
//			catch (InterruptedException e) {
//                System.out.println("Inside catch block due to " + Thread.currentThread().getName());
//			}
//		}
	}
}

// implementing Runnable Interface
class MyRunnable implements Runnable {
	@Override
	public void run() {
		//System.out.println("Thread start Running succesffuly using Runnable.");
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: "+i);
			try {
				Thread.sleep(3000);
			}
			catch (InterruptedException e) {
                System.out.println("Inside catch block due to " + Thread.currentThread().getName());
			}
		}
	}	
}

public class Mythread {
	
	public static void main(String[] args) {
		System.out.println("Main thread started");
		ThreadLearning thread1 = new ThreadLearning();
		ThreadLearning thread2 = new ThreadLearning();
		thread1.start();
		thread2.start();

	//	System.out.println(learning.getName());  // get the name of the thread
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		t1.start();
		t2.start();
     //   System.out.println(t1.currentThread().getName());
        
		System.out.println("Main thread completed");
	}

}


