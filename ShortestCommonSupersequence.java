package Dynamic_Programming;

/*Given two strings str1 and str2, find the shortest string that has both str1 and str2 as subsequences.
Input:   str1 = "geek",  str2 = "eke"
Output: "geeke"

Input:   str1 = "AGGTAB",  str2 = "GXTXAYB"
Output:  "AGXGTXAYB"*/

public class ShortestCommonSupersequence {

	public static void main(String[] args) {
		String X = "AGGTAB";
		String Y = "GXTXAYB";
		System.out.println("Length of the shortest supersequence is " + shortestSuperSequence(X, Y)); //9
	}

	static int shortestSuperSequence(String X, String Y) {
		int m = X.length();
		int n = Y.length();
		int l = lcs(X, Y, m, n); // find lcs
		return (m + n - l);
	}

	static int lcs(String X, String Y, int m, int n) {
		int[][] L = new int[m + 1][n + 1];
		int i, j;
		for (i = 0; i <= m; i++) {
			for (j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X.charAt(i - 1) == Y.charAt(j - 1))
					L[i][j] = L[i - 1][j - 1] + 1;
				else
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
			}
		}
		return L[m][n];
	}
}
