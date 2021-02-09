package Dynamic_Programming;

/*Problem statement: Consider a row of n coins of values v1 . . . vn, where n is even. We play a game against an opponent by alternating turns.
In each turn, a player selects either the first or last coin from the row, removes it from the row permanently, and receives the value of the coin. 
Determine the maximum possible amount of money we can definitely win if we move first.*/

public class OptimalStrategyGame {

	int max(int a, int b) {
		return a > b ? a : b;
	}

	int min(int a, int b) {
		return a < b ? a : b;
	}

	public static void main(String[] args) {
		int arr1[] = { 8, 15, 3, 7 };
		int n = arr1.length;
		System.out.println("" + optimalStrategyOfGame(arr1, n)); //22

		int arr2[] = { 2, 2, 2, 2 };
		n = arr2.length;
		System.out.println("" + optimalStrategyOfGame(arr2, n));//4

		int arr3[] = { 20, 30, 2, 2, 2, 10 };
		n = arr3.length;
		System.out.println("" + optimalStrategyOfGame(arr3, n));//42

	}

	static int optimalStrategyOfGame(int arr[], int n) {
		int table[][] = new int[n][n];
		int gap, i, j, x, y, z;
		for (gap = 0; gap < n; ++gap) {
			for (i = 0, j = gap; j < n; ++i, ++j) {
				x = ((i + 2) <= j) ? table[i + 2][j] : 0;
				y = ((i + 1) <= (j - 1)) ? table[i + 1][j - 1] : 0;
				z = (i <= (j - 2)) ? table[i][j - 2] : 0;
				table[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));
			}
		}
		return table[0][n - 1];
	}
}
