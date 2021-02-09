package Dynamic_Programming;

//Dynamic Programming based Solution
//Time complexity: O(N^2) Auxiliary Space: O(N^2)
public class MinimumInsertionsPalindrome1 {

	public static void main(String[] args) {
		String str = "geeks";
		System.out.println(findMinInsertionsDP(str.toCharArray(), str.length())); //3
	}

	static int findMinInsertionsDP(char str[], int n) {
		int table[][] = new int[n][n];
		int l, h, gap;
		for (gap = 1; gap < n; ++gap)
			for (l = 0, h = gap; h < n; ++l, ++h)
				table[l][h] = (str[l] == str[h]) ? table[l + 1][h - 1]
						: (Integer.min(table[l][h - 1], table[l + 1][h]) + 1);
		return table[0][n - 1];
	}
}
