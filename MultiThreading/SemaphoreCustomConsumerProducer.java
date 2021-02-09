package MultiThreading;

//SemaphoreCustom
public class SemaphoreCustomConsumerProducer {

	public static void main(String[] args) {
		SemaphoreCustom semaphoreProducer = new SemaphoreCustom(1);
		SemaphoreCustom semaphoreConsumer = new SemaphoreCustom(0);
		System.out.println("semaphoreProducer permit=1 | semaphoreConsumer permit=0");

		Producer producer = new Producer(semaphoreProducer, semaphoreConsumer);
		Consumer consumer = new Consumer(semaphoreConsumer, semaphoreProducer);

		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");

		producerThread.start();
		consumerThread.start();

	}

}

class SemaphoreCustom {

	private int permits;

	/**
	 * permits is the initial number of permits available. This value can be
	 * negative, in which case releases must occur before any acquires will be
	 * granted, permits is number of threads that can access shared resource at
	 * a time. If permits is 1, then only one threads that can access shared
	 * resource at a time.
	 */
	public SemaphoreCustom(int permits) {
		this.permits = permits;
	}

	/**
	 * Acquires a permit if one is available and decrements the number of
	 * available permits by 1. If no permit is available then the current thread
	 * waits until one of the following things happen > >some other thread calls
	 * release() method on this semaphore or, >some other thread interrupts the
	 * current thread.
	 */
	public synchronized void acquire() throws InterruptedException {
		// Acquires a permit, if permits is greater than 0 decrements
		// the number of available permits by 1.
		if (permits > 0) {
			permits--;
		}
		// permit is not available wait, when thread
		// is notified it decrements the permits by 1
		else {
			this.wait();
			permits--;
		}
	}

	/**
	 * Releases a permit and increases the number of available permits by 1. For
	 * releasing lock by calling release() method it’s not mandatory that thread
	 * must have acquired permit by calling acquire() method.
	 */
	public synchronized void release() {
		// increases the number of available permits by 1.
		permits++;

		// If permits are greater than 0, notify waiting threads.
		if (permits > 0)
			this.notifyAll();
	}
}

/**
 * Producer Class.
 */
class Producer implements Runnable {

	SemaphoreCustom semaphoreProducer;
	SemaphoreCustom semaphoreConsumer;

	public Producer(SemaphoreCustom semaphoreProducer, SemaphoreCustom semaphoreConsumer) {
		this.semaphoreProducer = semaphoreProducer;
		this.semaphoreConsumer = semaphoreConsumer;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				semaphoreProducer.acquire();
				System.out.println("Produced : " + i);
				semaphoreConsumer.release();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * Consumer Class.
 */
class Consumer implements Runnable {

	SemaphoreCustom semaphoreConsumer;
	SemaphoreCustom semaphoreProducer;

	public Consumer(SemaphoreCustom semaphoreConsumer, SemaphoreCustom semaphoreProducer) {
		this.semaphoreConsumer = semaphoreConsumer;
		this.semaphoreProducer = semaphoreProducer;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				semaphoreConsumer.acquire();
				System.out.println("Consumed : " + i);
				semaphoreProducer.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/*
 * OUTPUT
 * 
 * semaphoreProducer permit=1 | semaphoreConsumer permit=0 Produced : 1 Consumed
 * : 1 Produced : 2 Consumed : 2 Produced : 3 Consumed : 3 Produced : 4 Consumed
 * : 4 Produced : 5 Consumed : 5
 * 
 */