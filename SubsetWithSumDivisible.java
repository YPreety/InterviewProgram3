package Dynamic_Programming;

import java.util.Arrays;

/*Subset with sum divisible by m :- Given a set of non-negative distinct integers, and a value m, determine if there is a subset of the given set with sum 
divisible by m.
Input Constraints Size of set i.e., n <= 1000000, m <= 1000
Input : arr[] = {3, 1, 7, 5};  m = 6;
Output : YES
Time Complexity : O(m^2)
Auxiliary Space : O(m)
*/
public class SubsetWithSumDivisible {

	public static void main(String[] args) {
		int arr[] = { 1, 7 };
		int n = arr.length;
		int m = 5;
		if (modularSum(arr, n, m))
			System.out.print("YES\n");
		else
			System.out.print("NO\n"); //NO
	}

	static boolean modularSum(int arr[], int n, int m) {
		if (n > m)
			return true;
		boolean DP[] = new boolean[m];
		Arrays.fill(DP, false);
		for (int i = 0; i < n; i++) {
			if (DP[0])
				return true;
			boolean temp[] = new boolean[m];
			Arrays.fill(temp, false);
			for (int j = 0; j < m; j++) {
				if (DP[j] == true) {
					if (DP[(j + arr[i]) % m] == false)
						temp[(j + arr[i]) % m] = true;
				}
			}
			for (int j = 0; j < m; j++)
				if (temp[j])
					DP[j] = true;
			DP[arr[i] % m] = true;
		}
		return DP[0];
	}
}
