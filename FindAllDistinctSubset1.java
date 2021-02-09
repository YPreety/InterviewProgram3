package Dynamic_Programming;

//using Dynamic Programming
public class FindAllDistinctSubset1 {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
		int n = arr.length;
		printDistSum(arr, n);
	}

	static void printDistSum(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];
		boolean[][] dp = new boolean[n + 1][sum + 1];
		for (int i = 0; i <= n; i++)
			dp[i][0] = true;
		for (int i = 1; i <= n; i++) {
			dp[i][arr[i - 1]] = true;
			for (int j = 1; j <= sum; j++) {
				if (dp[i - 1][j] == true) {
					dp[i][j] = true;
					dp[i][j + arr[i - 1]] = true;
				}
			}
		}
		for (int j = 0; j <= sum; j++)
			if (dp[n][j] == true)
				System.out.print(j + " "); //0 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 20 
	}
}
