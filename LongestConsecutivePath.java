package Dynamic_Programming;

/*Find length of the longest consecutive path from a given starting character
Given a matrix of characters. Find length of the longest path from a given character, such that all characters in the path are consecutive to each other, 
i.e., every character in path is next to previous in alphabetical order. 
It is allowed to move in all 8 directions from a cell.

Input: mat[][] = { {a, c, d},
        {h, b, e},
        {i, g, f}}
Starting Point = 'e'

Output: 5*/
public class LongestConsecutivePath {

	static int x[] = {0, 1, 1, -1, 1, 0, -1, -1};
	static int y[] = { 1, 0, 1, 1, -1, -1, 0, -1 };
	static int R = 3;
	static int C = 3;
	static int dp[][] = new int[R][C];

	public static void main(String[] args) {
		char mat[][] = { { 'a', 'c', 'd' }, { 'h', 'b', 'a' }, { 'i', 'g', 'f' } };
		System.out.println(getLen(mat, 'a')); //4
		System.out.println(getLen(mat, 'e')); //0
		System.out.println(getLen(mat, 'b')); //3
		System.out.println(getLen(mat, 'f')); //4
	}

	static int getLen(char mat[][], char s) {
		for (int i = 0; i < R; ++i)
			for (int j = 0; j < C; ++j)
				dp[i][j] = -1;
		int ans = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (mat[i][j] == s) {
					for (int k = 0; k < 8; k++)
						ans = Math.max(ans, 1 + getLenUtil(mat, i + x[k], j + y[k], s));
				}
			}
		}
		return ans;
	}

	static int getLenUtil(char mat[][], int i, int j, char prev) {
		if (!isvalid(i, j) || !isadjacent(prev, mat[i][j]))
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];
		int ans = 0; // Initialize answer
		for (int k = 0; k < 8; k++)
			ans = Math.max(ans, 1 + getLenUtil(mat, i + x[k], j + y[k], mat[i][j]));
		return dp[i][j] = ans;
	}

	static boolean isadjacent(char prev, char curr) {
		return ((curr - prev) == 1);
	}

	static boolean isvalid(int i, int j) {
		if (i < 0 || j < 0 || i >= R || j >= C)
			return false;
		return true;
	}
}
