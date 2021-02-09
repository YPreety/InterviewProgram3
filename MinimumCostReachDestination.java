package Dynamic_Programming;

/*Find the minimum cost to reach destination using a train
There are N stations on route of a train. The train goes from station 0 to N-1. 
The ticket cost for all pair of stations (i, j) is given where j is greater than i. Find the minimum cost to reach the destination.
Input: 
cost[N][N] = { {0, 15, 80, 90},
              {INF, 0, 40, 50},
              {INF, INF, 0, 70},
              {INF, INF, INF, 0}
             };
There are 4 stations and cost[i][j] indicates cost to reach j 
from i. The entries where j < i are meaningless.

Output:
The minimum cost is 65
The minimum cost can be obtained by first going to station 1 
from 0. Then from station 1 to station 3.*/
public class MinimumCostReachDestination {

	static int INF = Integer.MAX_VALUE, N = 4;

	public static void main(String[] args) {
		int cost[][] = { { 0, 15, 80, 90 }, { INF, 0, 40, 50 }, { INF, INF, 0, 70 }, { INF, INF, INF, 0 } };
		System.out.println("The Minimum cost to reach station " + N + " is " + minCost(cost)); //The Minimum cost to reach station 4 is 65
	}

	static int minCost(int cost[][]) {
		return minCostRec(cost, 0, N - 1);
	}

	static int minCostRec(int cost[][], int s, int d) {
		if (s == d || s + 1 == d)
			return cost[s][d];
		int min = cost[s][d];
		for (int i = s + 1; i < d; i++) {
			int c = minCostRec(cost, s, i) + minCostRec(cost, i, d);
			if (c < min)
				min = c;
		}
		return min;
	}
}
