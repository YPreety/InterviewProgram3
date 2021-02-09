package Dynamic_Programming;

/*Minimum number of deletions to make a string palindrome
Given a string of size ‘n’. The task is to remove or delete minimum number of characters from the string so that the resultant string is palindrome.
Input : aebcbda
Output : 2
Remove characters 'e' and 'd'
Resultant string will be 'abcba'
which is a palindromic string

Input : geeksforgeeks
Output : 8

Time Complexity: O(n2)*/

public class MindeletetoPalin {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("Minimum number of deletions = " + minimumNumberOfDeletions(str)); //Minimum number of deletions = 8
	}

	static int minimumNumberOfDeletions(String str) {
		int n = str.length();
		int len = lps(str);
		return (n - len);
	}

	static int lps(String str) {
		int n = str.length();
		int L[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			L[i][i] = 1;
		for (int cl = 2; cl <= n; cl++) {
			for (int i = 0; i < n - cl + 1; i++) {
				int j = i + cl - 1;
				if (str.charAt(i) == str.charAt(j) && cl == 2)
					L[i][j] = 2;
				else if (str.charAt(i) == str.charAt(j))
					L[i][j] = L[i + 1][j - 1] + 2;
				else
					L[i][j] = Integer.max(L[i][j - 1], L[i + 1][j]);
			}
		}
		return L[0][n - 1];
	}
}
