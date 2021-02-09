package MultiThreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//Program to demonstrate usage of readLock() method of ReadWriteLock in java

/*void readLock()
More than one threads can acquire readLock at a time, provided no other thread is acquiring writeLock at same time in java.*/
public class ReadLockTest {

	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		MyRunnable myRunnable = new MyRunnable(readWriteLock);
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();

	}

}

class MyRunnable implements Runnable {

	ReadWriteLock readWriteLock;

	public MyRunnable(ReadWriteLock readWriteLock) {
		this.readWriteLock = readWriteLock;
	}

	public void run() {

		/*
		 * More than one threads can acquire readLock at a time provided no
		 * other thread is acquiring writeLock at same time.
		 */
		readWriteLock.readLock().lock();

		System.out.println(Thread.currentThread().getName() + " has acquired read lock.");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has released read lock.");

		readWriteLock.readLock().unlock();

	}
}

/*
 * OUTPUT
 * 
 * Thread-1 has acquired read lock. Thread-2 has acquired read lock. Thread-1
 * has released read lock. Thread-2 has released read lock.
 * 
 */