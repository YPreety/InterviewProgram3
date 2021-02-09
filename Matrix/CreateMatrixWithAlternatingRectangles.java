package Matrix;

/*Create a matrix with alternating rectangles of O and X
Input: m = 3, n = 3
Output: Following matrix 
X X X
X 0 X
X X X
Time Complexity: O(mn)
Auxiliary Space: O(mn)
*/
public class CreateMatrixWithAlternatingRectangles {

	public static void main(String[] args) {
		System.out.println("Output for m = 5, n = 6");
		fill0X(5, 6);
	}

	static void fill0X(int m, int n) {
		int i, k = 0, l = 0;
		int r = m, c = n;
		char a[][] = new char[m][n];
		char x = 'X';
		while (k < m && l < n) {
			for (i = l; i < n; ++i)
				a[k][i] = x;
			k++;
			for (i = k; i < m; ++i)
				a[i][n - 1] = x;
			n--;
			if (k < m) {
				for (i = n - 1; i >= l; --i)
					a[m - 1][i] = x;
				m--;
			}
			if (l < n) {
				for (i = m - 1; i >= k; --i)
					a[i][l] = x;
				l++;
			}
			x = (x == '0') ? 'X' : '0';
		}
		for (i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}
