package Dynamic_Programming;

import java.util.Vector;

/*Minimum cost to fill given weight in a bag
You are given a bag of size W kg and you are provided costs of packets different weights of oranges in array cost[] where cost[i] is basically cost 
of ‘i’ kg packet of oranges. Where cost[i] = -1 means that ‘i’ kg packet of orange is unavailable
Find the minimum total cost to buy exactly W kg oranges and if it is not possible to buy exactly W kg oranges then print -1. It may be assumed that there 
is infinite supply of all available packet types.
Input  : W = 5, cost[] = {20, 10, 4, 50, 100}
Output : 14
We can choose two oranges to minimize cost. First orange of 2Kg and cost 10. Second orange of 3Kg and cost 4. 
*/
public class MinimumCostToFill {

	public static void main(String[] args) {
		int cost[] = { 1, 2, 3, 4, 5 }, W = 5;
		int n = cost.length;
		System.out.println(MinimumCost(cost, n, W)); //5
	}

	public static int MinimumCost(int cost[], int n, int W) {
		Vector<Integer> val = new Vector<Integer>();
		Vector<Integer> wt = new Vector<Integer>();
		int size = 0;
		for (int i = 0; i < n; i++) {
			if (cost[i] != -1) {
				val.add(cost[i]);
				wt.add(i + 1);
				size++;
			}
		}
		n = size;
		int min_cost[][] = new int[n + 1][W + 1];
		for (int i = 0; i <= W; i++)
			min_cost[0][i] = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++)
			min_cost[i][0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= W; j++) {
				if (wt.get(i - 1) > j)
					min_cost[i][j] = min_cost[i - 1][j];
				else
					min_cost[i][j] = Math.min(min_cost[i - 1][j], min_cost[i][j - wt.get(i - 1)] + val.get(i - 1));
			}
		}
		return (min_cost[n][W] == Integer.MAX_VALUE) ? -1 : min_cost[n][W];
	}
}
