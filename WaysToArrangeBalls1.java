package Dynamic_Programming;

import java.util.Arrays;

//solved using Dynamic Programming (DP). 
/*Input  : p = 2, q = 1, r = 1
Output : 6
There are only six arrangements PQRP, QPRP,
PRQP, RPQP, PRPQ and PQPR*/

public class WaysToArrangeBalls1 {

	static final int MAX = 100;
	static int dp[][][][] = new int[MAX][MAX][MAX][3];

	public static void main(String[] args) {
		int p = 1, q = 1, r = 1;
		System.out.print(countUtil(p, q, r)); //6
	}

	static int countUtil(int p, int q, int r) {
		for (int[][][] row : dp) {
			for (int[][] innerRow : row) {
				for (int[] innerInnerRow : innerRow) {
					Arrays.fill(innerInnerRow, -1);
				}
			}
		}
		;
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
		if (dp[p][q][r][last] != -1)
			return dp[p][q][r][last];
		if (last == 0)
			dp[p][q][r][last] = countWays(p - 1, q, r, 1) + countWays(p - 1, q, r, 2);
		else if (last == 1)
			dp[p][q][r][last] = countWays(p, q - 1, r, 0) + countWays(p, q - 1, r, 2);
		else
			dp[p][q][r][last] = countWays(p, q, r - 1, 0) + countWays(p, q, r - 1, 1);
		return dp[p][q][r][last];
	}
}
