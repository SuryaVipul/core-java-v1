package MultiThreading.basics;

// start() vs run() difference
class StartThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("This is running in a separate thread!");
    }
}

class RunThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("This is running in the main thread, not a separate thread!");
    }
}

public class StartVsRun {
    public static void main(String[] args) {

        Thread st = new Thread(new StartThreadExample());
        st.start(); // Initiates a new thread of execution
                    // start the thread using start() method and allocated resources with the thread
                    //     Allocates resources for a new thread.
                     //   Calls the run() method internally in the new thread.
       // st.start();  // we can't call start() method twice it will throw an error in this case -> IllegalThreadStateException

        Thread rt = new Thread(new RunThreadExample());
        rt.run();   // does not start the thread it calls the run() method like normal method call
        rt.run();  // run() method can be called multiple times as it just a normal method calling.

    }
}
