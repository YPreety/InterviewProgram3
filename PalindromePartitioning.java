package Dynamic_Programming;

/*Given a string, a partitioning of the string is a palindrome partitioning if every substring of the partition is a palindrome. 
For example, “aba|b|bbabb|a|b|aba” is a palindrome partitioning of “ababbbabbababa”. */

/*For example, minimum 3 cuts are needed for “ababbbabbababa”. The three cuts are “a|babbbab|b|ababa”. 
If a string is palindrome, then minimum 0 cuts are needed. 
If a string of length n containing all different characters, then minimum n-1 cuts are needed.*/

//Min cuts needed for Palindrome Partitioning is 3
//Time Complexity: O(n3)
public class PalindromePartitioning {

	public static void main(String[] args) {
		String str = "ababbbabbababa";
		System.out.println("Min cuts needed for " + "Palindrome Partitioning is " + minPalPartion(str));
	}

	static int minPalPartion(String str) {
		int n = str.length();
		int[][] C = new int[n][n];
		boolean[][] P = new boolean[n][n];

		int i, j, k, L; // different looping variables
		for (i = 0; i < n; i++) {
			P[i][i] = true;
			C[i][i] = 0;
		}
		for (L = 2; L <= n; L++) {
			for (i = 0; i < n - L + 1; i++) {
				j = i + L - 1; // Set ending index
				if (L == 2)
					P[i][j] = (str.charAt(i) == str.charAt(j));
				else
					P[i][j] = (str.charAt(i) == str.charAt(j)) && P[i + 1][j - 1];
				if (P[i][j] == true)
					C[i][j] = 0;
				else {
					C[i][j] = Integer.MAX_VALUE;
					for (k = i; k <= j - 1; k++)
						C[i][j] = Integer.min(C[i][j], C[i][k] + C[k + 1][j] + 1);
				}
			}
		}
		return C[0][n - 1];
	}
}
