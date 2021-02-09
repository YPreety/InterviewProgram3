package Dynamic_Programming;

/*Count number of ways to reach destination in a Maze
Given a maze with obstacles, count number of paths to reach rightmost-bottommost cell from topmost-leftmost cell. 
A cell in given maze has value -1 if it is a blockage or dead end, else 0.

From a given cell, we are allowed to move to cells (i+1, j) and (i, j+1) only.

Input: maze[R][C] =  {{0,  0, 0, 0},
        {0, -1, 0, 0},
        {-1, 0, 0, 0},
        {0,  0, 0, 0}};
Output: 4
Time Complexity : O(R x C)*/

public class CountNumberOfWays {

	static int R = 4;
	static int C = 4;

	public static void main(String[] args) {
		int maze[][] = { { 0, 0, 0, 0 }, { 0, -1, 0, 0 }, { -1, 0, 0, 0 }, { 0, 0, 0, 0 } };
		System.out.println(countPaths(maze)); //4
	}

	static int countPaths(int maze[][]) {
		if (maze[0][0] == -1)
			return 0;
		for (int i = 0; i < R; i++) {
			if (maze[i][0] == 0)
				maze[i][0] = 1;
			else
				break;
		}
		for (int i = 1; i < C; i++) {
			if (maze[0][i] == 0)
				maze[0][i] = 1;
			else
				break;
		}
		for (int i = 1; i < R; i++) {
			for (int j = 1; j < C; j++) {
				if (maze[i][j] == -1)
					continue;
				if (maze[i - 1][j] > 0)
					maze[i][j] = (maze[i][j] + maze[i - 1][j]);
				if (maze[i][j - 1] > 0)
					maze[i][j] = (maze[i][j] + maze[i][j - 1]);
			}
		}
		return (maze[R - 1][C - 1] > 0) ? maze[R - 1][C - 1] : 0;
	}
}
