package Dynamic_Programming;

//Dynamic_Programming
public class CounNDigitNumbers1 {

	static int lookup[][] = new int[101][501];

	public static void main(String[] args) {
		int n = 2, sum = 5;
		System.out.println(finalCount(n, sum));//5

	}

	static int finalCount(int n, int sum) {
		for (int i = 0; i <= 100; ++i) {
			for (int j = 0; j <= 500; ++j) {
				lookup[i][j] = -1;
			}
		}
		int ans = 0;
		for (int i = 1; i <= 9; i++)
			if (sum - i >= 0)
				ans += countRec(n - 1, sum - i);
		return ans;
	}

	static int countRec(int n, int sum) {
		if (n == 0)
			return sum == 0 ? 1 : 0;
		if (lookup[n][sum] != -1)
			return lookup[n][sum];
		int ans = 0;
		for (int i = 0; i < 10; i++)
			if (sum - i >= 0)
				ans += countRec(n - 1, sum - i);
		return lookup[n][sum] = ans;
	}
}
