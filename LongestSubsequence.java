package Dynamic_Programming;

/*Longest subsequence such that difference between adjacents is one
Given an array of n size, the task is to find the longest subsequence such that difference between adjacents is one.
Input :  arr[] = {10, 9, 4, 5, 4, 8, 6}
Output :  3
As longest subsequences with difference 1 are, "10, 9, 8", "4, 5, 4" and "4, 5, 6"
Time Complexity: O(n2)
Auxiliary Space: O(n)
*/
public class LongestSubsequence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 3, 2 };
		int n = arr.length;
		System.out.println(longestSubseqWithDiffOne(arr, n)); //6
	}

	static int longestSubseqWithDiffOne(int arr[], int n) {
		int dp[] = new int[n];
		for (int i = 0; i < n; i++)
			dp[i] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if ((arr[i] == arr[j] + 1) || (arr[i] == arr[j] - 1))
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
		}
		int result = 1;
		for (int i = 0; i < n; i++)
			if (result < dp[i])
				result = dp[i];
		return result;
	}
}
