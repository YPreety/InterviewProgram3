package Dynamic_Programming;

/*Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) 
required to convert ‘str1’ into ‘str2’.

Insert
Remove
Replace*/

/*Input:   str1 = "geek", str2 = "gesek"
Output:  1 We can convert str1 into str2 by inserting a 's'.

Input:   str1 = "cat", str2 = "cut"
Output:  1 We can convert str1 into str2 by replacing 'a' with 'u'.

Input:   str1 = "sunday", str2 = "saturday"
Output:  3 Last three and first characters are same.  We basically need to convert "un" to "atur".  This can be done using
below three operations. Replace 'n' with 'r', insert t, insert a*/

public class EditDistance1 {

	public static void main(String[] args) {
		String str1 = "sunday";
		String str2 = "saturday";
		System.out.println(editDist(str1, str2, str1.length(), str2.length()));
	}

	static int editDist(String str1, String str2, int m, int n) {
		if (m == 0)
			return n;
		if (n == 0)
			return m;
		if (str1.charAt(m - 1) == str2.charAt(n - 1))
			return editDist(str1, str2, m - 1, n - 1);
		return 1 + min(editDist(str1, str2, m, n - 1), // Insert
				editDist(str1, str2, m - 1, n), // Remove
				editDist(str1, str2, m - 1, n - 1) // Replace
		);
	}
	static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return x;
		if (y <= x && y <= z)
			return y;
		else
			return z;
	}
}
