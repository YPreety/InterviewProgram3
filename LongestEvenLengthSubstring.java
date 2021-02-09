package Dynamic_Programming;

/*Longest Even Length Substring such that Sum of First and Second Half is same
Given a string ‘str’ of digits, find length of the longest substring of ‘str’, such that the length of the substring is 2k digits and sum of left k 
digits is equal to the sum of right k digits.
Input: str = "123123"
Output: 6
The complete string is of even length and sum of first and second
half digits is same

Input: str = "1538023"
Output: 4
The longest substring with same first and second half sum is "5380"
Simple Solution [ O(n3) ]*/
public class LongestEvenLengthSubstring {

	public static void main(String[] args) {
		String str = "1538023";
		System.out.println("Length of the substring is " + findLength(str)); //Length of the substring is 4
	}

	static int findLength(String str) {
		int n = str.length();
		int maxlen = 0; 
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j += 2) {
				int length = j - i + 1;
				int leftsum = 0, rightsum = 0;
				for (int k = 0; k < length / 2; k++) {
					leftsum += (str.charAt(i + k) - '0');
					rightsum += (str.charAt(i + k + length / 2) - '0');
				}
				if (leftsum == rightsum && maxlen < length)
					maxlen = length;
			}
		}
		return maxlen;
	}
}
