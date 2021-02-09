package Dynamic_Programming;

/*Find number of times a string occurs as a subsequence in given string
Given two strings, find the number of times the second string occurs in the first string, whether continuous or discontinuous.
Input:  
string a = "GeeksforGeeks"
string b = "Gks"

Output: 4

Explanation:  
The four strings are - (Check characters marked in bold)
GeeksforGeeks
GeeksforGeeks
GeeksforGeeks
GeeksforGeeks*/

public class NumberTimesStringOccursSubsequence {

	public static void main(String[] args) {
		String a = "GeeksforGeeks";
		String b = "Gks";
		System.out.println(count(a, b, a.length(), b.length())); //4
	}

	static int count(String a, String b, int m, int n) {
		if ((m == 0 && n == 0) || n == 0)
			return 1;
		if (m == 0)
			return 0;
		if (a.charAt(m - 1) == b.charAt(n - 1))
			return count(a, b, m - 1, n - 1) + count(a, b, m - 1, n);
		else
			return count(a, b, m - 1, n);
	}
}
