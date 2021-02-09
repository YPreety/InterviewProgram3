package Dynamic_Programming;

/*Find number of endless points
Given a binary N x N matrix, we need to find the total number of matrix positions from which there is an endless path. 
Input :  0 1 0
1 1 1
0 1 1
Output : 4
Endless points are (1, 1), (1, 2),(2, 1) and (2, 2). For all other points path to some corner is blocked at some point.
*/
public class FindNumberEndlessPoints {

	static final int MAX = 100;

	public static void main(String[] args) {
		boolean input[][] = { { true, false, true, true }, { false, true, true, true }, { true, true, true, true },
				{ false, true, true, false } };
		int n = 4;
		System.out.print(countEndless(input, n)); //5
	}

	static int countEndless(boolean input[][], int n) {
		boolean row[][] = new boolean[n][n];
		boolean col[][] = new boolean[n][n];
		for (int j = 0; j < n; j++) {
			boolean isEndless = true;
			for (int i = n - 1; i >= 0; i--) {
				if (input[i][j] == false)
					isEndless = false;
				col[i][j] = isEndless;
			}
		}
		for (int i = 0; i < n; i++) {
			boolean isEndless = true;
			for (int j = n - 1; j >= 0; j--) {
				if (input[i][j] == false)
					isEndless = false;
				row[i][j] = isEndless;
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++)
			for (int j = 1; j < n; j++)
				if (row[i][j] && col[i][j])
					ans++;
		return ans;
	}
}
