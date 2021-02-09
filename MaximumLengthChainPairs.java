package Dynamic_Programming;

/*You are given n pairs of numbers. In every pair, the first number is always smaller than the second number. 
A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed in this fashion. 
Find the longest chain which can be formed from a given set of pairs. 
For example, if the given pairs are {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} }, then the longest chain that can be 
formed is of length 3, and the chain is {{5, 24}, {27, 40}, {50, 90}}
Time Complexity: O(n^2)*/
public class MaximumLengthChainPairs {

	int a;
	int b;

	public MaximumLengthChainPairs(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		MaximumLengthChainPairs arr[] = new MaximumLengthChainPairs[] { new MaximumLengthChainPairs(5, 24),
				new MaximumLengthChainPairs(15, 25), new MaximumLengthChainPairs(27, 40),
				new MaximumLengthChainPairs(50, 60) };
		System.out.println("Length of maximum size chain is " + maxChainLength(arr, arr.length));
		//Length of maximum size chain is 3
	}

	static int maxChainLength(MaximumLengthChainPairs arr[], int n) {
		int i, j, max = 0;
		int mcl[] = new int[n];
		for (i = 0; i < n; i++)
			mcl[i] = 1;
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i].a > arr[j].b && mcl[i] < mcl[j] + 1)
					mcl[i] = mcl[j] + 1;
		for (i = 0; i < n; i++)
			if (max < mcl[i])
				max = mcl[i];
		return max;
	}
}
