package Dynamic_Programming;

/*Probability of Knight to remain in the chessboard
Given an NxN chessboard and a Knight at position (x,y). The Knight has to take exactly K steps, where at each step it chooses any of the 8 directions 
uniformly at random. What is the probability that the Knight remains in the chessboard after taking K steps, with the condition that it can’t enter 
the board again once it leaves it.

Let's take:
8x8 chessboard,
initial position of the knight : (0, 0),
number of steps : 1
At each step, the Knight has 8 different positions to choose from. 

If it starts from (0, 0), after taking one step it will lie inside the
board only at 2 out of 8 positions, and will lie outside at other positions.
So, the probability is 2/8 = 0.25

Time Complexity: O(NxNxKx8)  Space Complexity: O(NxNxK)*/
public class KnightRemainChessboard {

	static final int N = 8;
	static int dx[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static int dy[] = { 2, 1, -1, -2, -2, -1, 1, 2 };

	public static void main(String[] args) {
		int K = 3;
		System.out.println(findProb(0, 0, K));  //0.125
	}

	static double findProb(int start_x, int start_y, int steps) {
		double dp1[][][] = new double[N][N][N];
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				dp1[i][j][0] = 1;
		for (int s = 1; s <= steps; ++s) {
			for (int x = 0; x < N; ++x) {
				for (int y = 0; y < N; ++y) {
					double prob = 0.0;
					for (int i = 0; i < 8; ++i) {
						int nx = x + dx[i];
						int ny = y + dy[i];
						if (inside(nx, ny))
							prob += dp1[nx][ny][s - 1] / 8.0;
					}
					dp1[x][y][s] = prob;
				}
			}
		}
		return dp1[start_x][start_y][steps];
	}
	static boolean inside(int x, int y) {
		return (x >= 0 && x < N && y >= 0 && y < N);
	}
}
