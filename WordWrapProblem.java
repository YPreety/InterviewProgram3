package Dynamic_Programming;

/*Given a sequence of words, and a limit on the number of characters that can be put in one line (line width). Put line breaks in the given sequence 
 * such that the lines are printed neatly. Assume that the length of each word is smaller than the line width.

For example, consider the following string and line width M = 15
"Geeks for Geeks presents word wrap problem"     
Following is the optimized arrangement of words in 3 lines
Geeks for Geeks
presents word
wrap problem 

The total extra spaces in line 1, line 2 and line 3 are 0, 2 and 3 respectively. 
So optimal value of total cost is 0 + 2*2 + 3*3 = 13

Time Complexity: O(n^2)  Auxiliary Space: O(n^2) */
public class WordWrapProblem {

	final int MAX = Integer.MAX_VALUE;

	public static void main(String[] args) {
		WordWrapProblem w = new WordWrapProblem();
		int l[] = { 3, 2, 2, 5 };
		int n = l.length;
		int M = 6;
		w.solveWordWrap(l, n, M);
	}

	void solveWordWrap(int l[], int n, int M) {
		int extras[][] = new int[n + 1][n + 1];
		int lc[][] = new int[n + 1][n + 1];
		int c[] = new int[n + 1];
		int p[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			extras[i][i] = M - l[i - 1];
			for (int j = i + 1; j <= n; j++)
				extras[i][j] = extras[i][j - 1] - l[j - 1] - 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if (extras[i][j] < 0)
					lc[i][j] = MAX;
				else if (j == n && extras[i][j] >= 0)
					lc[i][j] = 0;
				else
					lc[i][j] = extras[i][j] * extras[i][j];
			}
		}
		c[0] = 0;
		for (int j = 1; j <= n; j++) {
			c[j] = MAX;
			for (int i = 1; i <= j; i++) {
				if (c[i - 1] != MAX && lc[i][j] != MAX && (c[i - 1] + lc[i][j] < c[j])) {
					c[j] = c[i - 1] + lc[i][j];
					p[j] = i;
				}
			}
		}

		printSolution(p, n);
	}

	int printSolution(int p[], int n) {
		int k;
		if (p[n] == 1)
			k = 1;
		else
			k = printSolution(p, p[n] - 1) + 1;
		System.out.println("Line number" + " " + k + ": " + "From word no." + " " + p[n] + " " + "to" + " " + n);
		return k;
	}

}


/*Line number 1: From word no. 1 to 1
Line number 2: From word no. 2 to 3
Line number 3: From word no. 4 to 4*/