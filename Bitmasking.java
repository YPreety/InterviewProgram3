package Dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

//Count ways to assign unique cap to every person:- There 100 different types of caps each having a unique id from 1 to 100. 
/*Also, there ‘n’ persons each having a collection of variable number of caps. One day all of these persons decide to go in a party wearing a cap but to 
look unique they decided that none them will wear the same type of cap.
So, count the total number of arrangements or ways such that none of them is wearing same type of cap.
Input: 
3
5 100 1     // Collection of first person.
2           // Collection of second person.
5 100       // Collection of second person.

Output:4
Explanation: All valid possible ways are (5, 2, 100),  (100, 2, 5),  (1, 2, 5) and  (1, 2, 100)*/
public class Bitmasking {

	static final int MOD = 1000000007;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Vector<Integer> capList[] = new Vector[101];
	static int dp[][] = new int[1025][101];
	static int allmask;

	public static void main(String[] args) throws Exception {
		int n; 
		for (int i = 0; i < capList.length; i++)
			capList[i] = new Vector<>();
		n = Integer.parseInt(br.readLine());
		countWays(n);

	}

	static void countWays(int n) throws Exception {
		String str;
		String split[];
		int x;
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			split = str.split(" ");
			for (int j = 0; j < split.length; j++) {
				x = Integer.parseInt(split[j]);
				capList[x].add(i);
			}

		}
		allmask = (1 << n) - 1;
		for (int[] is : dp) {
			for (int i = 0; i < is.length; i++) {
				is[i] = -1;
			}
		}
		System.out.println(countWaysUtil(0, 1));
	}

	static long countWaysUtil(int mask, int i) {
		if (mask == allmask)
			return 1;
		if (i > 100)
			return 0;
		if (dp[mask][i] != -1)
			return dp[mask][i];
		long ways = countWaysUtil(mask, i + 1);
		int size = capList[i].size();
		for (int j = 0; j < size; j++) {
			if ((mask & (1 << capList[i].get(j))) != 0)
				continue;
			else
				ways += countWaysUtil(mask | (1 << capList[i].get(j)), i + 1);
			ways %= MOD;
		}
		return dp[mask][i] = (int) ways;
	}
}
