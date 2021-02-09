package Dynamic_Programming;

/*Find minimum adjustment cost of an array
Input: arr = [1, 3, 0, 3], target = 1
Output: Minimum adjustment cost is 3
Explanation: One of the possible solutions is [2, 3, 2, 3]*/

public class MinimumAdjustmentCost {

	public static int M = 100;

	public static void main(String[] args) {
		int arr[] = { 55, 77, 52, 61, 39, 6, 25, 60, 49, 47 };
		int n = arr.length;
		int target = 10;
		System.out.println("Minimum adjustment cost is " + minAdjustmentCost(arr, n, target));//Minimum adjustment cost is 75
	}
	static int minAdjustmentCost(int A[], int n, int target) {
		int[][] dp = new int[n][M + 1];
		for (int j = 0; j <= M; j++)
			dp[0][j] = Math.abs(j - A[0]);
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= M; j++) {
				dp[i][j] = Integer.MAX_VALUE;
				int k = Math.max(j - target, 0);
				for (; k <= Math.min(M, j + target); k++)
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + Math.abs(A[i] - j));
			}
		}
		int res = Integer.MAX_VALUE;
		for (int j = 0; j <= M; j++)
			res = Math.min(res, dp[n - 1][j]);
		return res;
	}
}
