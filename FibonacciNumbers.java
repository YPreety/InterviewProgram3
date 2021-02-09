package Dynamic_Programming;

/*Method 1 ( Use recursion ) 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.*/

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(fib(n)); //34
	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
}
