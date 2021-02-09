package Dynamic_Programming;

/*Given a string, find length of the longest repeating subseequence such that the two subsequence don’t have same string character at same position, i.e., 
any i’th character in the two subsequences shouldn’t have the same index in the original string.
Input: str = "abc"
Output: 0
There is no repeating subsequence

Input: str = "aab"
Output: 1*/
public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		String str = "aabb";
		System.out.println("The length of the largest subsequence that" + " repeats itself is : "
				+ findLongestRepeatingSubSeq(str)); //2 
	}

	static int findLongestRepeatingSubSeq(String str) {
		int n = str.length();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		return dp[n][n];
	}
}
