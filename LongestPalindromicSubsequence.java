package Dynamic_Programming;

/*Given a sequence, find the length of the longest palindromic subsequence in it.
if the given sequence is “BBABCBCAB”, then the output should be 7 as “BABCBAB” is the longest palindromic subseuqnce in it.
“BBBBB” and “BBCBB” are also palindromic subsequences of the given sequence, but not the longest ones.
Time Complexity  is O(n^2)*/

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		String seq = "GEEKSFORGEEKS";
		int n = seq.length();
		System.out.println("The lnegth of the lps is " + lps(seq)); //The lnegth of the lps is 5
	}

	static int lps(String seq) {
		int n = seq.length();
		int i, j, cl;
		int L[][] = new int[n][n]; 
		for (i = 0; i < n; i++)
			L[i][i] = 1;
		for (cl = 2; cl <= n; cl++) {
			for (i = 0; i < n - cl + 1; i++) {
				j = i + cl - 1;
				if (seq.charAt(i) == seq.charAt(j) && cl == 2)
					L[i][j] = 2;
				else if (seq.charAt(i) == seq.charAt(j))
					L[i][j] = L[i + 1][j - 1] + 2;
				else
					L[i][j] = max(L[i][j - 1], L[i + 1][j]);
			}
		}
		return L[0][n - 1];
	}

	static int max(int x, int y) {
		return (x > y) ? x : y;
	}
}
