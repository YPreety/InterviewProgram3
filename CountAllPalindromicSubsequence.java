package Dynamic_Programming;

/*Count All Palindromic Subsequence in a given String

Find how many palindromic subsequence (need not necessarily be distinct) can be formed in a given string. Note that the empty string is not considered 
as a palindrome.
Input : str = "abcd"
Output : 4
Explanation :- palindromic  subsequence are : "a" ,"b", "c" ,"d" 
Time Complexity : O(N2)*/

public class CountAllPalindromicSubsequence {

	public static void main(String[] args) {
		String str = "abcb";
		System.out.println("Total palindromic " + "subsequence are : " + countPS(str)); //Total palindromic subsequence are : 6
	}

	static int countPS(String str) {
		int N = str.length();
		int[][] cps = new int[N + 1][N + 1];
		for (int i = 0; i < N; i++)
			cps[i][i] = 1;
		for (int L = 2; L <= N; L++) {
			for (int i = 0; i < N; i++) {
				int k = L + i - 1;
				if (k < N) {
					if (str.charAt(i) == str.charAt(k))
						cps[i][k] = cps[i][k - 1] + cps[i + 1][k] + 1;
					else
						cps[i][k] = cps[i][k - 1] + cps[i + 1][k] - cps[i + 1][k - 1];
				}
			}
		}
		return cps[0][N - 1];
	}
}
