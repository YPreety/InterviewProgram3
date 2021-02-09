package Dynamic_Programming;

/*Method 3 ( Space Optimized Method 2 )
Time Complexity: O(n)  Extra Space: O(1)*/

public class FibonacciNumbers2 {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(fib(n)); //34
	}

	static int fib(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
}
