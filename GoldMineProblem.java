package Dynamic_Programming;

import java.util.Arrays;

/*Given a gold mine of n*m dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially the miner is at 
first column but can be at any row. He can move only (right->,right up /,right down\) that is from a given cell, the miner can move to the cell diagonally 
up towards the right or right or diagonally down towards the right. Find out maximum amount of gold he can collect.
Input : mat[][] = {{1, 3, 3},
        {2, 1, 4},
       {0, 6, 4}};
Output : 12 
{(1,0)->(2,1)->(2,2)}
Time Complexity :O(m*n)
Space Complexity :O(m*n)
*/
public class GoldMineProblem {

	static final int MAX = 100;

	public static void main(String[] args) {
		int gold[][] = { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };
		int m = 4, n = 4;
		System.out.print(getMaxGold(gold, m, n)); //16
	}

	static int getMaxGold(int gold[][], int m, int n) {
		int goldTable[][] = new int[m][n];
		for (int[] rows : goldTable)
			Arrays.fill(rows, 0);
		for (int col = n - 1; col >= 0; col--) {
			for (int row = 0; row < m; row++) {
				int right = (col == n - 1) ? 0 : goldTable[row][col + 1];
				int right_up = (row == 0 || col == n - 1) ? 0 : goldTable[row - 1][col + 1];
				int right_down = (row == m - 1 || col == n - 1) ? 0 : goldTable[row + 1][col + 1];
				goldTable[row][col] = gold[row][col] + Math.max(right, Math.max(right_up, right_down));
				;
			}
		}
		int res = goldTable[0][0];
		for (int i = 1; i < m; i++)
			res = Math.max(res, goldTable[i][0]);
		return res;
	}
}
