package Dynamic_Programming;

/*Memoization (Top Down): 
The memoized program for a problem is similar to the recursive version with a small modification that it looks into a lookup table 
before computing solutions. We initialize a lookup array with all initial values as NIL. Whenever we need solution to a subproblem, 
we first look into the lookup table. If the precomputed value is there then we return that value, otherwise we calculate the value 
and put the result in lookup table so that it can be reused later.*/

public class Memoization {

	final int MAX = 100;
	final int NIL = -1;

	int lookup[] = new int[MAX];

	public static void main(String[] args) {
		Memoization f = new Memoization();
		int n = 40;
		f._initialize();
		System.out.println("Fibonacci number is" + " " + f.fib(n));

	}

	void _initialize() {
		for (int i = 0; i < MAX; i++)
			lookup[i] = NIL;
	}

	int fib(int n) {
		if (lookup[n] == NIL) {
			if (n <= 1)
				lookup[n] = n;
			else
				lookup[n] = fib(n - 1) + fib(n - 2);
		}
		return lookup[n];
	}

}
