package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);

		for (int i = 1; i <= 6; i++) {
			LoopTask1 loopTask = new LoopTask1("LoopTask " + i);
			es.submit(loopTask);
		}
		es.shutdown();
	}

}

class LoopTask1 implements Runnable {

	private String loopTaskName;

	public LoopTask1(String loopTaskName) {
		super();
		this.loopTaskName = loopTaskName;
	}

	@Override
	public void run() {
		System.out.println("Starting " + loopTaskName);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Executing " + loopTaskName + " with " + Thread.currentThread().getName() + "====" + i);
		}
		System.out.println("Ending " + loopTaskName);
	}
}