package Matrix;

/*Given an n x n matrix and a number x, find position of x in the matrix if it is present in it. Else print “Not Found”. In the given matrix, 
every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.

Input : mat[4][4] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
x = 29
Output : Found at (2, 1)
Time Complexity: O(n)
*/
public class SearchRowWiseColumnWiseSortedMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		search(mat, 4, 29);
	}

	private static void search(int[][] mat, int n, int x) {
		int i = 0, j = n - 1; 
		while (i < n && j >= 0) {
			if (mat[i][j] == x) {
				System.out.print("n Found at " + i + " " + j);
				return;
			}
			if (mat[i][j] > x)
				j--;
			else 
				i++;
		}
		System.out.print("n Element not found");
		return; 
	}
}
