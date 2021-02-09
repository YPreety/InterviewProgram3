package Dynamic_Programming;

/*We have given numbers in form of triangle, by starting at the top of the triangle and moving to adjacent numbers on the row below, 
find the maximum total from top to bottom.
Input : 
	   3
	  7 4
	 2 4 6
	8 5 9 3
	Output : 23
	Explanation : 3 + 7 + 4 + 9 = 23 

	Input :
	   8
	 -4 4
	 2 2 6
	1 1 1 1
	Output : 19
	Explanation : 8 + 4 + 6 + 1 = 19 
*/
public class MaximumPathSumTriangle {

	static int N = 3;
	public static void main(String[] args) {
		int tri[][] = { { 1, 0, 0 }, { 4, 8, 0 }, { 1, 5, 3 } };
		System.out.println(maxPathSum(tri, 2, 2));//14
	}

	static int maxPathSum(int tri[][], int m, int n) {
		for (int i = m - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (tri[i + 1][j] > tri[i + 1][j + 1])
					tri[i][j] += tri[i + 1][j];
				else
					tri[i][j] += tri[i + 1][j + 1];
			}
		}
		return tri[0][0];
	}
}
