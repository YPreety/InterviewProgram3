package Dynamic_Programming;

/*Count all possible paths from top left to bottom right of a mXn matrix
The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that 
from each cell you can either move only to right or down
recursively  count all possible paths from top left to bottom right*/
public class CountallPossiblePaths {

	public static void main(String[] args) {
		System.out.println(numberOfPaths(3, 3));
	}

	static int numberOfPaths(int m, int n) {
		if (m == 1 || n == 1)
			return 1;
		return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
	}
}
