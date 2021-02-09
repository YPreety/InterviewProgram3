package Dynamic_Programming;

//using Dynamic programming. Time Complexity : O(n) Auxiliary Space : O(n)
public class RecursivelBreakNumber1 {

	final int MAX = 1000000;

	public static void main(String[] args) {
		int n = 24;
		System.out.println(breakSum(n));//27
	}

	static int breakSum(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++)
			dp[i] = Math.max(dp[i / 2] + dp[i / 3] + dp[i / 4], i);
		return dp[n];
	}
}
