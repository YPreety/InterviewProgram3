package MultiThreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


//Program to demonstrate usage of writeLock() method of ReadWriteLock in java

/*void writeLock()
Only one threads can acquire writeLock at a time. Means writeLock can only be obtained if no other thread is acquiring read or 
write lock at that time in java.*/

public class WriteLockTest {

	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		MyRunnable1 myRunnable = new MyRunnable1(readWriteLock);
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();

	}

}

class MyRunnable1 implements Runnable {

	ReadWriteLock readWriteLock;

	public MyRunnable1(ReadWriteLock readWriteLock) {
		this.readWriteLock = readWriteLock;
	}

	public void run() {

		/*
		 * Only one threads can acquire writeLock at a time. Means writeLock can
		 * only be obtained if no other thread is acquiring read or write lock
		 * at that time.
		 */
		readWriteLock.writeLock().lock();

		System.out.println(Thread.currentThread().getName() + " has acquired write lock.");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has released write lock.");

		readWriteLock.writeLock().unlock();

	}
}
/*OUTPUT

Thread-1 has acquired write lock.
Thread-1 has released write lock.
Thread-2 has acquired write lock.
Thread-2 has released write lock.
 
*/