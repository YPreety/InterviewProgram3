package Dynamic_Programming;

/*Modify array to maximize sum of adjacent differences
Given an array, we need to modify values of this array in such a way that sum of absolute differences between two consecutive elements is maximized. 
If the value of an array element is X, then we can change it to either 1 or X.
Input  : arr[] = [3, 2, 1, 4, 5]
Output : 8
We can modify above array as, Modified arr[] = [3, 1, 1, 4, 1]
Sum of differences = |1-3| + |1-1| + |4-1| + |1-4| = 8
Which is the maximum obtainable value among all choices of modification.
Time Complexity : O(N)
Auxiliary Space : O(N)*/

public class MaximizeSumDifferences {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 4, 5 };
		int N = arr.length;
		System.out.println(maximumDifferenceSum(arr, N)); //8
	}

	static int maximumDifferenceSum(int arr[], int N) {
		int dp[][] = new int[N][2];
		for (int i = 0; i < N; i++)
			dp[i][0] = dp[i][1] = 0;
		for (int i = 0; i < (N - 1); i++) {
			dp[i + 1][0] = Math.max(dp[i][0], dp[i][1] + Math.abs(1 - arr[i]));
			dp[i + 1][1] = Math.max(dp[i][0] + Math.abs(arr[i + 1] - 1), dp[i][1] + Math.abs(arr[i + 1] - arr[i]));
		}
		return Math.max(dp[N - 1][0], dp[N - 1][1]);
	}
}
