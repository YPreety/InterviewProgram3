package Dynamic_Programming;

//Dynamic Programming [ O(n2) and O(n2) extra space]
public class LongestEvenLengthSubstring1 {

	public static void main(String[] args) {
		String str = "153803";
		System.out.println("Length of the substring is " + findLength(str)); //Length of the substring is 4
	}

	static int findLength(String str) {
		int n = str.length();
		int maxlen = 0; // Initialize result
		int sum[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			sum[i][i] = str.charAt(i) - '0';
		for (int len = 2; len <= n; len++) {
			for (int i = 0; i < n - len + 1; i++) {
				int j = i + len - 1;
				int k = len / 2;
				sum[i][j] = sum[i][j - k] + sum[j - k + 1][j];
				if (len % 2 == 0 && sum[i][j - k] == sum[(j - k + 1)][j] && len > maxlen)
					maxlen = len;
			}
		}
		return maxlen;
	}
}
