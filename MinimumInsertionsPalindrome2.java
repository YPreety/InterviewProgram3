package Dynamic_Programming;

//Another Dynamic Programming Solution
//Time complexity of this method is also O(n^2) and this method also requires O(n^2) extra space.

public class MinimumInsertionsPalindrome2 {

	public static void main(String[] args) {
		String str = "geeks";
		System.out.println(findMinInsertionsLCS(str, str.length())); //3
	}

	static int findMinInsertionsLCS(String str, int n) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String revString = sb.toString();
		return (n - lcs(str, revString, n, n));
	}

	static int lcs(String X, String Y, int m, int n) {
		int L[][] = new int[n + 1][n + 1];
		int i, j;
		for (i = 0; i <= m; i++) {
			for (j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X.charAt(i - 1) == Y.charAt(j - 1))
					L[i][j] = L[i - 1][j - 1] + 1;
				else
					L[i][j] = Integer.max(L[i - 1][j], L[i][j - 1]);
			}
		}
		return L[m][n];
	}
}
