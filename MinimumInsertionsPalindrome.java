package Dynamic_Programming;

/* Given a string, find the minimum number of characters to be inserted to convert it to palindrome.
Recursive Solution
Before we go further, let us understand with few examples:
    ab: Number of insertions required is 1. bab
    aa: Number of insertions required is 0. aa
    abcd: Number of insertions required is 3. dcbabcd
    abcda: Number of insertions required is 2. adcbcda which is same as number of insertions in the substring bcd(Why?).
    abcde: Number of insertions required is 4. edcbabcde
    */
public class MinimumInsertionsPalindrome {

	public static void main(String[] args) {
		String str = "geeks";
		System.out.println(findMinInsertions(str.toCharArray(), 0, str.length() - 1)); //3
	}

	static int findMinInsertions(char str[], int l, int h) {
		if (l > h)
			return Integer.MAX_VALUE;
		if (l == h)
			return 0;
		if (l == h - 1)
			return (str[l] == str[h]) ? 0 : 1;
		return (str[l] == str[h]) ? findMinInsertions(str, l + 1, h - 1)
				: (Integer.min(findMinInsertions(str, l, h - 1), findMinInsertions(str, l + 1, h)) + 1);
	}
}
