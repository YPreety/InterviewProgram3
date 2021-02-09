package Dynamic_Programming;

/*Count Possible Decodings of a given Digit Sequence
Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence, count the number of possible decodings of the given digit sequence.
Input:  digits[] = "121"
Output: 3
// The possible decodings are "ABA", "AU", "LA"
*/
public class CountPossibleDecodings {

	public static void main(String[] args) {
		char digits[] = { '1', '2', '3', '4' };
		int n = digits.length;
		System.out.printf("Count is %d", countDecoding(digits, n)); //Count is 3
	}

	static int countDecoding(char[] digits, int n) {
		if (n == 0 || n == 1)
			return 1;
		int count = 0;
		if (digits[n - 1] > '0')
			count = countDecoding(digits, n - 1);
		if (digits[n - 2] == '1' || (digits[n - 2] == '2' && digits[n - 1] < '7'))
			count += countDecoding(digits, n - 2);
		return count;
	}
}
