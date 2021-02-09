package GeneralProgramming;

public class StopThreadUsingInterrupt {

	public static void main(String[] args) {
		MyThread1 thread = new MyThread1();
		thread.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		while (!Thread.interrupted()) {
			System.out.println("I am running....");
		}
		System.out.println("Stopped Running.....");
	}
}