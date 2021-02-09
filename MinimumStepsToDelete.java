package Dynamic_Programming;

/*Minimum steps to delete a string after repeated deletion of palindrome substrings
Given a string containing characters as integers only. We need to delete all character of this string in a minimum number of steps where in one step 
we can delete the substring which is a palindrome. After deleting a substring remaining parts are concatenated.
Input : s = “2553432”
Output : 2
We can delete all character of above string in 2 steps, first deleting the substring s[3, 5] “343” and then remaining string completely  s[0, 3] “2552”
*/
public class MinimumStepsToDelete {

	public static void main(String[] args) {
		String str = "2553432";
		System.out.println(minStepToDeleteString(str)); //2 
	}

	static int minStepToDeleteString(String str) {
		int N = str.length();
		int[][] dp = new int[N + 1][N + 1];
		for (int i = 0; i <= N; i++)
			for (int j = 0; j <= N; j++)
				dp[i][j] = 0;
		for (int len = 1; len <= N; len++) {
			for (int i = 0, j = len - 1; j < N; i++, j++) {
				if (len == 1)
					dp[i][j] = 1;
				else {
					dp[i][j] = 1 + dp[i + 1][j];
					if (str.charAt(i) == str.charAt(i + 1))
						dp[i][j] = Math.min(1 + dp[i + 2][j], dp[i][j]);
					for (int K = i + 2; K <= j; K++)
						if (str.charAt(i) == str.charAt(K))
							dp[i][j] = Math.min(dp[i + 1][K - 1] + dp[K + 1][j], dp[i][j]);
				}
			}
		}
		return dp[0][N - 1];
	}
}
