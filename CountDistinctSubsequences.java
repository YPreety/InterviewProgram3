package Dynamic_Programming;

import java.util.Arrays;

/*Input  : str = "gfg"
Output : 7
The seven distinct subsequences are "", "g", "f",
"gf", "fg", "gg" and "gfg" 

Input  : str = "ggg"
Output : 4
The six distinct subsequences are "", "g", "gg"
and "ggg"
Time Complexity : O(n)
Auxiliary Space : O(n)
*/

public class CountDistinctSubsequences {

	static final int MAX_CHAR = 256;

	public static void main(String[] args) {
		System.out.println(countSub("gfg"));//7
	}

	static int countSub(String str) {
		int[] last = new int[MAX_CHAR];
		Arrays.fill(last, -1);
		int n = str.length();
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			dp[i] = 2 * dp[i - 1];
			if (last[(int) str.charAt(i - 1)] != -1)
				dp[i] = dp[i] - dp[last[(int) str.charAt(i - 1)]];
			last[(int) str.charAt(i - 1)] = (i - 1);
		}
		return dp[n];
	}
}
