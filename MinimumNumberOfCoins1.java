package Dynamic_Programming;

//Dynamic Programming(DP) problems,
//Time complexity of the above solution is O(mV).
public class MinimumNumberOfCoins1 {

	public static void main(String[] args) {
		int coins[] = { 9, 6, 5, 1 };
		int m = coins.length;
		int V = 11;
		System.out.println("Minimum coins required is " + minCoins(coins, m, V));//2
	}

	static int minCoins(int coins[], int m, int V) {
		int table[] = new int[V + 1];
		table[0] = 0;
		for (int i = 1; i <= V; i++)
			table[i] = Integer.MAX_VALUE;
		for (int i = 1; i <= V; i++) {
			for (int j = 0; j < m; j++)
				if (coins[j] <= i) {
					int sub_res = table[i - coins[j]];
					if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
						table[i] = sub_res + 1;
				}
		}
		return table[V];
	}
}
