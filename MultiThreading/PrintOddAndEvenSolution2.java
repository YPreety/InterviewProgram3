package MultiThreading;

public class PrintOddAndEvenSolution2 implements Runnable {

	public int PRINT_NUMBERS_UPTO = 10;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	PrintOddAndEvenSolution2(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO) {
			synchronized (lock) {
				while (number % 2 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintOddAndEvenSolution2 oddRunnable = new PrintOddAndEvenSolution2(1);
		PrintOddAndEvenSolution2 evenRunnable = new PrintOddAndEvenSolution2(0);

		Thread t1 = new Thread(oddRunnable, "Odd");
		Thread t2 = new Thread(evenRunnable, "Even");

		t1.start();
		t2.start();

	}

}
