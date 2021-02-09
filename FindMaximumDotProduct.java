package Dynamic_Programming;

import java.util.Arrays;

/*Find Maximum dot product of two arrays with insertion of 0’s
Given two arrays of positive integers of size m and n where m > n. We need to maximize the dot product by inserting zeros in the second array but 
we cannot disturb the order of elements.
Input : A[] = {2, 3 , 1, 7, 8} 
B[] = {3, 6, 7}        
Output : 107
Time Complexity : O(nm)
*/

public class FindMaximumDotProduct {

	public static void main(String[] args) {
		int A[] = { 2, 3, 1, 7, 8 };
		int B[] = { 3, 6, 7 };
		int m = A.length;
		int n = B.length;
		System.out.print(MaxDotProduct(A, B, m, n));//107
	}

	static int MaxDotProduct(int A[], int B[], int m, int n) {
		int dp[][] = new int[n + 1][m + 1];
		for (int[] row : dp)
			Arrays.fill(row, 0);
		for (int i = 1; i <= n; i++)
			for (int j = i; j <= m; j++)
				dp[i][j] = Math.max((dp[i - 1][j - 1] + (A[j - 1] * B[i - 1])), dp[i][j - 1]);
		return dp[n][m];
	}
}
