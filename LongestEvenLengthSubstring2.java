package Dynamic_Programming;

//Dynamic Programming[A O(n2) and O(n) extra space solution]
public class LongestEvenLengthSubstring2 {

	public static void main(String[] args) {
		String str = "123123";
		System.out.println("Length of the substring is " + findLength(str, str.length())); //Length of the substring is 6
	}

	static int findLength(String str, int n) {
		int sum[] = new int[n + 1];
		sum[0] = 0;
		for (int i = 1; i <= n; i++)
			sum[i] = (sum[i - 1] + str.charAt(i - 1) - '0');
		int ans = 0; // initialize result
		for (int len = 2; len <= n; len += 2) {
			for (int i = 0; i <= n - len; i++) {
				int j = i + len - 1;
				if (sum[i + len / 2] - sum[i] == sum[i + len] - sum[i + len / 2])
					ans = Math.max(ans, len);
			}
		}
		return ans;
	}
}
