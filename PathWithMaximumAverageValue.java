package Dynamic_Programming;

/*Given a square matrix of size N*N, where each cell is associated with a specific cost. A path is defined as a specific sequence of cells which starts 
from top left cell move only right or down and ends on bottom right cell. We want to find a path with maximum average over all existing paths. 
Average is computed as total cost divided by number of cells visited in path.
Input : Matrix = [1, 2, 3
                  4, 5, 6
                  7, 8, 9]
Output : 5.8
Path with maximum average is, 1 -> 4 -> 7 -> 8 -> 9 Sum of the path is 29 and average is 29/5 = 5.8
*/
public class PathWithMaximumAverageValue {

	public static void main(String[] args) {
		int cost[][] = { { 1, 2, 3 }, { 6, 5, 4 }, { 7, 3, 9 } };
		System.out.println(maxAverageOfPath(cost, 3));//5.2
	}

	public static double maxAverageOfPath(int cost[][], int N) {
		int dp[][] = new int[N + 1][N + 1];
		dp[0][0] = cost[0][0];
		for (int i = 1; i < N; i++)
			dp[i][0] = dp[i - 1][0] + cost[i][0];
		for (int j = 1; j < N; j++)
			dp[0][j] = dp[0][j - 1] + cost[0][j];
		for (int i = 1; i < N; i++)
			for (int j = 1; j < N; j++)
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + cost[i][j];
		return (double) dp[N - 1][N - 1] / (2 * N - 1);
	}
}
