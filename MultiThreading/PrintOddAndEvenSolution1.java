package MultiThreading;

//Problem:- You are given two threads. You need to print odd numbers using one thread and even numbers using another thread.
//You need to print in natural order up to MAX.

/*For example:
If MAX is 10, you need to print:

1 2 3 4 5 6 7 8 9 10
So 1 3 5 7 9 will be printed by odd thread
2 4 6 8 10 will be printed by even thread.
*/
public class PrintOddAndEvenSolution1 {

	boolean odd;
	int count = 1;
	int MAX = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintOddAndEvenSolution1 oep = new PrintOddAndEvenSolution1();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printEven();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printOdd();

			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking odd loop");

				while (!odd) {
					try {
						System.out.println("Odd waiting : " + count);
						wait();
						System.out.println("Notified odd :" + count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread :" + count);
				count++;
				odd = false;
				notify();
			}
		}
	}

	public void printEven() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking even loop");

				while (odd) {
					try {
						System.out.println("Even waiting: " + count);
						wait();
						System.out.println("Notified even:" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even thread :" + count);
				count++;
				odd = true;
				notify();

			}
		}
	}

}
