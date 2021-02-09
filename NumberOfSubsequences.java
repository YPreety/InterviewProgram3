package Dynamic_Programming;

/*Number of subsequences of the form a^i b^j c^k
Expected Time Complexity : O(n)
Input  : abbc
Output : 3
Subsequences are abc, abc and abbc

Input  : abcabc
Output : 7
Subsequences are abc, abc, abbc, aabc
abcc, abc and abc*/

public class NumberOfSubsequences {

	public static void main(String[] args) {
		String s = "abbc";
		System.out.println(countSubsequences(s)); //3
	}

	static int countSubsequences(String s) {
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				aCount = (1 + 2 * aCount);
			else if (s.charAt(i) == 'b')
				bCount = (aCount + 2 * bCount);
			else if (s.charAt(i) == 'c')
				cCount = (bCount + 2 * cCount);
		}
		return cCount;
	}
}
