package Dynamic_Programming;

/*Given a rope of length n meters, cut the rope in different parts of integer lengths in a way that maximizes product of lengths of all parts. 
You must make at least one cut. Assume that the length of rope is more than 2 meters.
Input: n = 2
Output: 1 (Maximum obtainable product is 1*1)

Input: n = 3
Output: 2 (Maximum obtainable product is 1*2)*/

// Overlapping Subproblems
public class MaximumProductCutting {

	public static void main(String[] args) {
		System.out.println("Maximum Product is " + maxProd(10)); //Maximum Product is 36
	}

	static int maxProd(int n) {
		if (n == 0 || n == 1)
			return 0;
		int max_val = 0;
		for (int i = 1; i < n; i++)
			max_val = Math.max(max_val, Math.max(i * (n - i), maxProd(n - i) * i));
		return max_val;
	}
}
