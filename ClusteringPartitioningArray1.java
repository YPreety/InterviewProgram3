package Dynamic_Programming;

//Dynamic Programming:
//Time Complexity: Having the three simple loops, the complexity of the above algorithm is O(n^2k).
public class ClusteringPartitioningArray1 {

	static int inf = 1000000000;

	public static void main(String[] args) {
		int k = 2;
		int a[] = { 1, 5, 8, 10 };
		int n = a.length;
		System.out.println(minCost(a, n, k)); //20
	}

	static int minCost(int a[], int n, int k) {
		int dp[][] = new int[n + 1][k + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= k; j++)
				dp[i][j] = inf;
		dp[0][0] = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= k; j++)
				for (int m = i - 1; m >= 0; m--)
					dp[i][j] = Math.min(dp[i][j], dp[m][j - 1] + (a[i - 1] - a[m]) * (a[i - 1] - a[m]));

		return dp[n][k];
	}
}
