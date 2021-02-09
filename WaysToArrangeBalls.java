package Dynamic_Programming;

/*Ways to arrange Balls such that adjacent balls are of different types
There are ‘p’ balls of type P, ‘q’ balls of type Q and ‘r’ balls of type R. Using the balls we want to create a straight line such that no two balls 
of same type are adjacent.
Naive Solution:
Input  : p = 1, q = 1, r = 0
Output : 2
There are only two arrangements PQ and QP*/

public class WaysToArrangeBalls {

	public static void main(String[] args) {
		int p = 1, q = 1, r = 1;
		System.out.print(countUtil(p, q, r)); //6
	}

	static int countUtil(int p, int q, int r) {
		return countWays(p, q, r, 0) + // Last required balls is type P
				countWays(p, q, r, 1) + // Last required balls is type Q
				countWays(p, q, r, 2); // Last required balls is type R
	}

	static int countWays(int p, int q, int r, int last) {
		if (p < 0 || q < 0 || r < 0)
			return 0;
		if (p == 1 && q == 0 && r == 0 && last == 0)
			return 1;
		if (p == 0 && q == 1 && r == 0 && last == 1)
			return 1;
		if (p == 0 && q == 0 && r == 1 && last == 2)
			return 1;
		if (last == 0)
			return countWays(p - 1, q, r, 1) + countWays(p - 1, q, r, 2);
		if (last == 1)
			return countWays(p, q - 1, r, 0) + countWays(p, q - 1, r, 2);
		if (last == 2)
			return countWays(p, q, r - 1, 0) + countWays(p, q, r - 1, 1);
		return 0;
	}
}
