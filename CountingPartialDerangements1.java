package Dynamic_Programming;

//DP based Java program to find n-th Rencontres Number
public class CountingPartialDerangements1 {

	static int MAX = 100;

	public static void main(String[] args) {
		int n = 7, m = 2;
		int C[][] = new int[MAX][MAX];
		binomialCoeff(C, n, m);
		System.out.println(RencontresNumber(C, n, m));//924
	}

	static void binomialCoeff(int C[][], int n, int k) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {
				if (j == 0 || j == i)
					C[i][j] = 1;
				else
					C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
			}
		}
	}

	static int RencontresNumber(int C[][], int n, int m) {
		int dp[][] = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (j <= i) {
					if (i == 0 && j == 0)
						dp[i][j] = 1;
					else if (i == 1 && j == 0)
						dp[i][j] = 0;
					else if (j == 0)
						dp[i][j] = (i - 1) * (dp[i - 1][0] + dp[i - 2][0]);
					else
						dp[i][j] = C[i][j] * dp[i - j][0];
				}
			}
		}
		return dp[n][m];
	}
}
