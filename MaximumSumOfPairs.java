package Dynamic_Programming;

import java.util.Arrays;

/*Maximum sum of pairs with specific difference
Given an array of integers and a number k. We can pair two number of array if difference between them is strictly less than k. The task is to find 
maximum possible sum of disjoint pairs. Sum of P pairs is sum of all 2P numbers of pairs.
Input  : arr[] = {3, 5, 10, 15, 17, 12, 9}, K = 4
Output : 62
Then disjoint pairs with difference less than K are,(3, 5), (10, 12), (15, 17)  So maximum sum which we can get is 3 + 5 + 12 + 10 + 15 + 17 = 62
Note that an alternate way to form disjoint pairs is, (3, 5), (9, 12), (15, 17), but this pairing produces lesser sum.
Time complexity : O(N Log N)
Auxiliary Space : O(N)
*/
public class MaximumSumOfPairs {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 10, 15, 17, 12, 9 };
		int N = arr.length;
		int K = 4;
		System.out.println(maxSumPairWithDifferenceLessThanK(arr, N, K)); //62
	}

	static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) {
		Arrays.sort(arr);
		int dp[] = new int[N];
		dp[0] = 0;
		for (int i = 1; i < N; i++) {
			dp[i] = dp[i - 1];
			if (arr[i] - arr[i - 1] < K) {
				if (i >= 2)
					dp[i] = Math.max(dp[i], dp[i - 2] + arr[i] + arr[i - 1]);
				else
					dp[i] = Math.max(dp[i], arr[i] + arr[i - 1]);
			}
		}
		return dp[N - 1];
	}
}
