package Dynamic_Programming;

import java.util.Arrays;

/*Maximum path sum for each position with jumps under divisibility condition
Given an array of n positive integers. Initially we are at first position. We can jump to position y (1 <= x <= n) from position x (1 <= x <= n) 
if x divides y and x < y. The task is to print maximum sum path ending at every position x. Note : Since first element is at position 1, we can jump to 
any position from here as 1 divides all other position numbers.
Input :  arr[] = {2, 3, 1, 4, 6, 5}
Output : 2 5 3 9 8 10
Time Complexity: O(n*sqrt(n)).
*/
public class MaximumPathSumPosition {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 4, 6, 5 };
		int n = arr.length;
		printMaxSum(arr, n); 
	}

	static void printMaxSum(int arr[], int n) {
		int dp[] = new int[n];
		Arrays.fill(dp, 0);
		for (int i = 0; i < n; i++) {
			dp[i] = arr[i];
			int maxi = 0;
			for (int j = 1; j <= Math.sqrt(i + 1); j++) {
				if (((i + 1) % j == 0) && (i + 1) != j) {
					if (dp[j - 1] > maxi)
						maxi = dp[j - 1];
					if (dp[(i + 1) / j - 1] > maxi && j != 1)
						maxi = dp[(i + 1) / j - 1];
				}
			}
			dp[i] += maxi;
		}
		for (int i = 0; i < n; i++)
			System.out.print(dp[i] + " ");//2 5 3 9 8 10 
	}
}
