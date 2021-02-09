package Matrix;

/*Count number of islands where every island is row-wise and column-wise separated
Given a rectangular matrix which has only two possible values ‘X’ and ‘O’. The values ‘X’ always appear in form of rectangular islands and these 
islands are always row-wise and column-wise separated by at least one line of ‘O’s. Note that islands can only be diagonally adjacent. 
Count the number of islands in the given matrix.
mat[M][N] =  {{'O', 'O', 'O'},
        {'X', 'X', 'O'},
        {'X', 'X', 'O'},
        {'O', 'O', 'X'},
        {'O', 'O', 'X'},
        {'X', 'X', 'O'}
       };
Output: Number of islands is 3
Time complexity of this solution is O(MN).
*/
public class CountNumberofIslands {

	public static void main(String[] args) {
		int m = 6;
		int n = 3;
		int mat[][] = { { 'O', 'O', 'O' }, { 'X', 'X', 'O' }, { 'X', 'X', 'O' }, { 'O', 'O', 'X' }, { 'O', 'O', 'X' },
				{ 'X', 'X', 'O' } };
		System.out.println("Number of rectangular islands is: " + countIslands(mat, m, n));
	}

	static int countIslands(int mat[][], int m, int n) {
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 'X') {
					if ((i == 0 || mat[i - 1][j] == 'O') && (j == 0 || mat[i][j - 1] == 'O'))
						count++;
				}
			}
		}
		return count;
	}
}
