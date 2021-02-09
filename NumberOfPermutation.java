package Dynamic_Programming;

/*Number of permutation with K inversions
Input  : N = 3, K = 1
Output : 2
Explanation :  
Total Permutation of first N number,
123, 132, 213, 231, 312, 321
Permutation with 1 inversion : 132 and 213

Input  : N = 4, K = 2
Output : 2*/

public class NumberOfPermutation {

	static int M = 100;
	static int memo[][] = new int[M][M];

	public static void main(String[] args) {
		int N = 4;
		int K = 2;
		System.out.println(numberOfPermWithKInversion(N, K));//5
	}

	static int numberOfPermWithKInversion(int N, int K) {
		if (N == 0)
			return 0;
		if (K == 0)
			return 1;
		if (memo[N][K] != 0)
			return memo[N][K];
		int sum = 0;
		for (int i = 0; i <= K; i++) {
			if (i <= N - 1)
				sum += numberOfPermWithKInversion(N - 1, K - i);
		}
		memo[N][K] = sum;
		return sum;
	}
}
