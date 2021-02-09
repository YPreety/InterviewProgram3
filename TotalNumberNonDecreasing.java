package Dynamic_Programming;

/*Total number of non-decreasing numbers with n digits
given the number of digits n, you are required to find the count of total non-decreasing numbers with n digits.
Input:  n = 1
Output: count  = 10

Input:  n = 2
Output: count  = 55
*/
public class TotalNumberNonDecreasing {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(countNonDecreasing(n)); //220
	}

	static int countNonDecreasing(int n) {
		int dp[][] = new int[10][n + 1];
		for (int i = 0; i < 10; i++)
			dp[i][1] = 1;
		for (int digit = 0; digit <= 9; digit++) {
			for (int len = 2; len <= n; len++) {
				for (int x = 0; x <= digit; x++)
					dp[digit][len] += dp[x][len - 1];
			}
		}
		int count = 0;
		for (int i = 0; i < 10; i++)
			count += dp[i][n];
		return count;
	}
}
