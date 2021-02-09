package Dynamic_Programming;

/*Longest Common Subsequence
subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 
For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. 

LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
*/

//Time complexity of recursive approach is O(2^n) in worst case

public class LCS_Overlapping {

	public static void main(String[] args) {
		LCS_Overlapping lcs = new LCS_Overlapping();
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length;
		int n = Y.length;

		System.out.println("Length of LCS is" + " " + lcs.lcs(X, Y, m, n));

	}

	int lcs(char[] X, char[] Y, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (X[m - 1] == Y[n - 1])
			return 1 + lcs(X, Y, m - 1, n - 1);
		else
			return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

}
