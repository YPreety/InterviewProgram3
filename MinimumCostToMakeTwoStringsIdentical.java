package Dynamic_Programming;

/*Given two strings X and Y, and two values costX and costY. We need to find minimum cost required to make the given two strings identical. 
We can delete characters from both the strings. The cost of deleting a character from string X is costX and from Y is costY. 
Cost of removing all characters from a string is same.
Input :  X = "abcd", Y = "acdb", costX = 10, costY = 20.
Output:  30
For Making both strings identical we have to delete 
character 'b' from both the string, hence cost will
be = 10 + 20 = 30.
Minimum Cost to make two strings  identical is = 60*/
public class MinimumCostToMakeTwoStringsIdentical {

	public static void main(String[] args) {
		String X = "ef";
		String Y = "gh";
		System.out.println("Minimum Cost to make two strings " + " identical is = " + findMinCost(X, Y, 10, 20));
	}

	static int findMinCost(String X, String Y, int costX, int costY) {
		int m = X.length();
		int n = Y.length();
		int len_LCS;
		len_LCS = lcs(X, Y, m, n);
		return costX * (m - len_LCS) + costY * (n - len_LCS);
	}

	static int lcs(String X, String Y, int m, int n) {
		int L[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
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
