package Dynamic_Programming;

/*Input:  N = 11
Output: 27
We can at most get 27 A's on screen by pressing 
following key sequence.
A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V, Ctrl A, 
Ctrl C, Ctrl V, Ctrl V*/

public class PrintMaximumNumber1 {

	public static void main(String[] args) {
		int N;
		for (N = 1; N <= 20; N++)
			System.out.println("Maximum Number of A's with keystrokes is " + N + findoptimal(N));
	}

	static int findoptimal(int N) {
		if (N <= 6)
			return N;
		int screen[] = new int[N];
		int b; // To pick a breakpoint
		int n;
		for (n = 1; n <= 6; n++)
			screen[n - 1] = n;
		for (n = 7; n <= N; n++) {
			screen[n - 1] = 0;
			for (b = n - 3; b >= 1; b--) {
				int curr = (n - b - 1) * screen[b - 1];
				if (curr > screen[n - 1])
					screen[n - 1] = curr;
			}
		}
		return screen[N - 1];
	}
}
