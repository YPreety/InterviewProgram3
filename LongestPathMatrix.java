package Dynamic_Programming;

/*Find the longest path in a matrix with given constraints
Given a n*n matrix where all numbers are distinct, find the maximum length path (starting from any cell) such that all cells along the path are in
increasing order with a difference of 1.
Time complexity of the above solution is O(n2).
Input:  mat[][] = {{1, 2, 9}
{5, 3, 8}
{4, 6, 7}}
Output: 4
The longest path is 6-7-8-9.*/

public class LongestPathMatrix {

	public static int n = 3;

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 9 }, { 5, 3, 8 }, { 4, 6, 7 } };
		System.out.println("Length of the longest path is " + finLongestOverAll(mat)); //4
	}

	static int finLongestOverAll(int mat[][]) {
		int result = 1;
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				dp[i][j] = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (dp[i][j] == -1)
					findLongestFromACell(i, j, mat, dp);
				result = Math.max(result, dp[i][j]);
			}
		}
		return result;
	}

	static int findLongestFromACell(int i, int j, int mat[][], int dp[][]) {
		if (i < 0 || i >= n || j < 0 || j >= n)
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];
		if (j < n - 1 && ((mat[i][j] + 1) == mat[i][j + 1]))
			return dp[i][j] = 1 + findLongestFromACell(i, j + 1, mat, dp);
		if (j > 0 && (mat[i][j] + 1 == mat[i][j - 1]))
			return dp[i][j] = 1 + findLongestFromACell(i, j - 1, mat, dp);
		if (i > 0 && (mat[i][j] + 1 == mat[i - 1][j]))
			return dp[i][j] = 1 + findLongestFromACell(i - 1, j, mat, dp);
		if (i < n - 1 && (mat[i][j] + 1 == mat[i + 1][j]))
			return dp[i][j] = 1 + findLongestFromACell(i + 1, j, mat, dp);
		return dp[i][j] = 1;
	}
}
