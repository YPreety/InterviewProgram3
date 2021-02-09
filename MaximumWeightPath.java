package Dynamic_Programming;

/*Maximum weight path ending at any element of last row in a matrix :- Time complexity : O(N*N)
Given a matrix of integers where every element represents weight of the cell. Find the path having the maximum weight in matrix [N X N]. 
Path Traversal Rules are:
1) It should begin from top left element.
2) The path can end at any element of last row.
3) We can move to following two cells from a cell (i, j).
     a) Down Move : (i+1, j)
     b) Diagonal Move : (i+1, j+1)
Input : N = 5
mat[5][5] = {{ 4, 2 ,3 ,4 ,1 },
             { 2 , 9 ,1 ,10 ,5 },
             {15, 1 ,3 , 0 ,20 },
             {16 ,92, 41, 44 ,1},
             {8, 142, 6, 4, 8} };
Output : 255
Path with max weight : 4 + 2 +15 + 92 + 142 = 255  
*/
public class MaximumWeightPath {

	public static void main(String[] args) {
		int mat[][] = { { 4, 1, 5, 6, 1 }, { 2, 9, 2, 11, 10 }, { 15, 1, 3, 15, 2 }, { 16, 92, 41, 4, 3 },
				{ 8, 142, 6, 4, 8 } };
		int N = 5;
		System.out.println("Maximum Path Sum : " + maxCost(mat, N)); //Maximum Path Sum : 255
	}

	public static int maxCost(int mat[][], int N) {
		int dp[][] = new int[N][N];
		dp[0][0] = mat[0][0];
		for (int i = 1; i < N; i++)
			dp[i][0] = mat[i][0] + dp[i - 1][0];
		for (int i = 1; i < N; i++)
			for (int j = 1; j < i + 1 && j < N; j++)
				dp[i][j] = mat[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
		int result = 0;
		for (int i = 0; i < N; i++)
			if (result < dp[N - 1][i])
				result = dp[N - 1][i];
		return result;
	}
}
