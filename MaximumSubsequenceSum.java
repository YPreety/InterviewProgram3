package Dynamic_Programming;

/*Maximum subsequence sum such that no three are consecutive
Given a sequence of positive numbers, find the maximum sum that can be formed which has no three consecutive elements present.
Input: arr[] = {1, 2, 3}
Output: 5
We can't take three of them, so answer is 2 + 3 = 5

Input: arr[] = {3000, 2000, 1000, 3, 10}
Output: 5013 
3000 + 2000 + 3 + 10 = 5013
Time Complexity : O(n)
Auxiliary Space : O(n)
*/
public class MaximumSubsequenceSum {

	public static void main(String[] args) {
		int arr[] = { 100, 1000, 100, 1000, 1 };
		int n = arr.length;
		System.out.println(maxSumWO3Consec(arr, n)); //2101
	}

	static int maxSumWO3Consec(int arr[], int n) {
		int sum[] = new int[n];
		sum[0] = arr[0];
		sum[1] = arr[0] + arr[1];
		sum[2] = Math.max(sum[1], Math.max(arr[1] + arr[2], arr[0] + arr[2]));
		for (int i = 3; i < n; i++)
			sum[i] = Math.max(Math.max(sum[i - 1], sum[i - 2] + arr[i]), arr[i] + arr[i - 1] + sum[i - 3]);
		return sum[n - 1];
	}
}
