package MultiThreading;

//ThreadDeath error - calling stop method on thread throws ThreadDeath error in java
public class ThreadDeathDemo {

	public static void main(String[] args) {
		Thread thread1 = new Thread("thread-1") {
            public void run() {
                  try {
                         System.out.println(Thread.currentThread().getName()
                                       + " has started");
                         //calling stop method throws ThreadDeath error.
                         stop();

                  } catch (ThreadDeath e) {
                         System.out.println(Thread.currentThread().getName()
                                       + " has died");
                  }
            }
     };
     thread1.start();

	}

}
/*OUTPUT

thread-1 has started
thread-1 has died
 
*/