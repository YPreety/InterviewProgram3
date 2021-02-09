package Dynamic_Programming;

/* A Naive Java Program for LIS Implementation */
/*The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such 
that all elements of the subsequence are sorted in increasing order.
For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20*/
public class LongestIncreasingSubsequence {

	static int max_ref;

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n) + "n"); //Length of lis is 5n
	}

	static int lis(int arr[], int n) {
		max_ref = 1;
		_lis(arr, n);
		return max_ref;
	}

	static int _lis(int arr[], int n) {
		if (n == 1)
			return 1;
		int res, max_ending_here = 1;
		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;
		return max_ending_here;
	}
}
