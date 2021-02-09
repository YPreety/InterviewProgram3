package Dynamic_Programming;

/*The longest Zig-Zag subsequence problem is to find length of the longest subsequence of given sequence such that all elements of this are alternating.
Input: arr[] = {10, 22, 9, 33, 49, 50, 31, 60}
Output: 6
The subsequences {10, 22, 9, 33, 31, 60} or
{10, 22, 9, 49, 31, 60} or {10, 22, 9, 50, 31, 60}
are longest Zig-Zag of length 6.
Time Complexity: O(n2)
Auxiliary Space: O(n)*/

public class LongestZigZagSubsequence {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 49, 50, 31, 60 };
		int n = arr.length;
		System.out.println("Length of Longest " + "Zig-Zag subsequence is " + zzis(arr, n)); //Length of Longest Zig-Zag subsequence is 6
	}

	static int zzis(int arr[], int n) {
		int Z[][] = new int[n][2];
		for (int i = 0; i < n; i++)
			Z[i][0] = Z[i][1] = 1;
		int res = 1; 
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && Z[i][0] < Z[j][1] + 1)
					Z[i][0] = Z[j][1] + 1;
				if (arr[j] > arr[i] && Z[i][1] < Z[j][0] + 1)
					Z[i][1] = Z[j][0] + 1;
			}
			if (res < Math.max(Z[i][0], Z[i][1]))
				res = Math.max(Z[i][0], Z[i][1]);
		}
		return res;
	}
}
