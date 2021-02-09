package Matrix;

/*Find a common element in all rows of a given row-wise sorted matrix
Given a matrix where every row is sorted in increasing order. Write a function that finds and returns a common element in all rows. If there is 
no common element, then returns -1.
Input: mat[4][5] = { {1, 2, 3, 4, 5},
        {2, 4, 5, 8, 10},
        {3, 5, 7, 9, 11},
        {1, 3, 5, 7, 9},
      };
Output: 5
Time complexity of the above hashing based solution is O(MN)
*/
public class CommonElementinAllRows {

	static final int M = 4;
	static final int N = 5;

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4, 5 }, { 2, 4, 5, 8, 10 }, { 3, 5, 7, 9, 11 }, { 1, 3, 5, 7, 9 } };
		int result = findCommon(mat);
		if (result == -1)
			System.out.print("No common element");
		else
			System.out.print("Common element is " + result);
	}

	static int findCommon(int mat[][]) {
		int column[] = new int[M];
		int min_row;
		int i;
		for (i = 0; i < M; i++)
			column[i] = N - 1;
		min_row = 0;
		while (column[min_row] >= 0) {
			for (i = 0; i < M; i++) {
				if (mat[i][column[i]] < mat[min_row][column[min_row]])
					min_row = i;
			}
			int eq_count = 0;
			for (i = 0; i < M; i++) {
				if (mat[i][column[i]] > mat[min_row][column[min_row]]) {
					if (column[i] == 0)
						return -1;
					column[i] -= 1;
				} else
					eq_count++;
			}
			if (eq_count == M)
				return mat[min_row][column[min_row]];
		}
		return -1;
	}
}
