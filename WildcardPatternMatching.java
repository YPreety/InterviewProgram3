package Dynamic_Programming;

import java.util.Arrays;

/*Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that finds if wildcard pattern is matched with text. 
The matching should cover the entire text (not partial text).

The wildcard pattern can include the characters ‘?’ and ‘*’
‘?’ – matches any single character
‘*’ – Matches any sequence of characters (including the empty sequence)

Text = "baaabab",
Pattern = “*****ba*****ab", output : true
Pattern = "baaa?ab", output : true
Pattern = "ba*a?", output : true
Pattern = "a*ab", output : false 
Time complexity of above solution is O(m x n). Auxiliary space used is also O(m x n).
*/

public class WildcardPatternMatching {

	public static void main(String[] args) {
		String str = "baaabab";
		String pattern = "*****ba*****ab";
		if (strmatch(str, pattern, str.length(), pattern.length()))
			System.out.println("Yes"); //Yes
		else
			System.out.println("No");
	}

	static boolean strmatch(String str, String pattern, int n, int m) {
		if (m == 0)
			return (n == 0);
		boolean[][] lookup = new boolean[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++)
			Arrays.fill(lookup[i], false);
		lookup[0][0] = true;
		for (int j = 1; j <= m; j++)
			if (pattern.charAt(j - 1) == '*')
				lookup[0][j] = lookup[0][j - 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (pattern.charAt(j - 1) == '*')
					lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j];
				else if (pattern.charAt(j - 1) == '?' || str.charAt(i - 1) == pattern.charAt(j - 1))
					lookup[i][j] = lookup[i - 1][j - 1];
				else
					lookup[i][j] = false;
			}
		}
		return lookup[n][m];
	}
}
