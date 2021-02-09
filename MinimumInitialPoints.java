package Dynamic_Programming;

/*Minimum Initial Points to Reach Destination:- Given a grid with each cell consisting of positive, negative or no points i.e, zero points.
We can move across a cell only if we have positive points ( > 0 ). Whenever we pass through a cell, points in that cell are added to our overall points.
We need to find minimum initial points to reach cell (m-1, n-1) from (0, 0).

Constraints :
From a cell (i, j) we can move to (i+1, j) or (i, j+1).
We cannot move from (i, j) if your overall points at (i, j) is <= 0.
We have to reach at (n-1, m-1) with minimum positive points i.e., > 0.

Input: points[m][n] = { {-2, -3,   3}, 
        {-5, -10,  1}, 
        {10,  30, -5} 
      };
Output: 7
Explanation: 7 is the minimum value to reach destination with positive throughout the path. Below is the path.
(0,0) -> (0,1) -> (0,2) -> (1, 2) -> (2, 2)*/

public class MinimumInitialPoints {

	public static void main(String[] args) {
		int points[][] = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		int R = 3, C = 3;
		System.out.println("Minimum Initial Points Required: " + minInitialPoints(points, R, C));//7
	}

	static int minInitialPoints(int points[][], int R, int C) {
		int dp[][] = new int[R][C];
		int m = R, n = C;
		dp[m - 1][n - 1] = points[m - 1][n - 1] > 0 ? 1 : Math.abs(points[m - 1][n - 1]) + 1;
		for (int i = m - 2; i >= 0; i--)
			dp[i][n - 1] = Math.max(dp[i + 1][n - 1] - points[i][n - 1], 1);
		for (int j = n - 2; j >= 0; j--)
			dp[m - 1][j] = Math.max(dp[m - 1][j + 1] - points[m - 1][j], 1);
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				int min_points_on_exit = Math.min(dp[i + 1][j], dp[i][j + 1]);
				dp[i][j] = Math.max(min_points_on_exit - points[i][j], 1);
			}
		}
		return dp[0][0];
	}
}
