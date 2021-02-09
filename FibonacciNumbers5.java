package Dynamic_Programming;

/*Method 6 (O(Log n) Time)
Time complexity of this solution is O(Log n) */
public class FibonacciNumbers5 {

	static int MAX = 1000;
	static int f[];

	public static void main(String[] args) {
		int n = 9;
		f = new int[MAX];
		System.out.println(fib(n));//34
	}

	public static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return (f[n] = 1);
		if (f[n] != 0)
			return f[n];
		int k = (n & 1) == 1 ? (n + 1) / 2 : n / 2;
		f[n] = (n & 1) == 1 ? (fib(k) * fib(k) + fib(k - 1) * fib(k - 1)) : (2 * fib(k - 1) + fib(k)) * fib(k);
		return f[n];
	}
}
