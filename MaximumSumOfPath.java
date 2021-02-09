package Dynamic_Programming;

/*Maximum sum of a path in a Right Number Triangle
Given a right triangle of numbers, find the largest of the sum of numbers that appear on the paths starting from the top towards the base, 
so that on each path the next number is located directly below or below-and-one-place-to-the-right.
Input : 1
1 2
4 1 2
2 3 1 1        
Output : 9
Explanation : 1 + 1 + 4 + 3
*/
public class MaximumSumOfPath {

	public static void main(String[] args) {
		int tri[][] = { { 1 }, { 2, 1 }, { 3, 3, 2 } };
		System.out.println(maxSum(tri, 3)); //6
	}

	static int maxSum(int tri[][], int n) {
		if (n > 1)
			tri[1][1] = tri[1][1] + tri[0][0];
		tri[1][0] = tri[1][0] + tri[0][0];
		for (int i = 2; i < n; i++) {
			tri[i][0] = tri[i][0] + tri[i - 1][0];
			tri[i][i] = tri[i][i] + tri[i - 1][i - 1];
			for (int j = 1; j < i; j++) {
				if (tri[i][j] + tri[i - 1][j - 1] >= tri[i][j] + tri[i - 1][j])
					tri[i][j] = tri[i][j] + tri[i - 1][j - 1];
				else
					tri[i][j] = tri[i][j] + tri[i - 1][j];
			}
		}
		int max = tri[n - 1][0];
		for (int i = 1; i < n; i++) {
			if (max < tri[n - 1][i])
				max = tri[n - 1][i];
		}
		return max;
	}
}
