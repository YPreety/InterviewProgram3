package Dynamic_Programming;

/*Unbounded Knapsack (Repetition of items allowed)
Given a knapsack weight W and a set of n items with certain value vali and weight wti, we need to calculate minimum amount that could make up this quantity
exactly.
Input : W = 100
val[]  = {1, 30}
wt[] = {1, 50}
Output : 100*/

public class UnboundedKnapsack {

	public static void main(String[] args) {
		int W = 100;
		int val[] = { 10, 30, 20 };
		int wt[] = { 5, 10, 15 };
		int n = val.length;
		System.out.println(unboundedKnapsack(W, n, val, wt));//300
	}

	private static int unboundedKnapsack(int W, int n, int[] val, int[] wt) {
		int dp[] = new int[W + 1];
		for (int i = 0; i <= W; i++) {
			for (int j = 0; j < n; j++) {
				if (wt[j] <= i) {
					dp[i] = max(dp[i], dp[i - wt[j]] + val[j]);
				}
			}
		}
		return dp[W];
	}

	private static int max(int i, int j) {
		return (i > j) ? i : j;
	}
}
