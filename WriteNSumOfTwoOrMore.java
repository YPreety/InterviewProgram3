package Dynamic_Programming;

import java.util.Arrays;

//Ways to write n as sum of two or more positive integers
//For a given number n > 0, find the number of different ways in which n can be written as a sum of at two or more positive integers.
/*Input : n = 5
Output : 6
Explanation : All possible six ways are :
4 + 1
3 + 2
3 + 1 + 1
2 + 2 + 1
2 + 1 + 1 + 1
1 + 1 + 1 + 1 + 1
Time complexity O(n2)*/

public class WriteNSumOfTwoOrMore {

	public static void main(String[] args) {
		int n = 7;
		System.out.print(countWays(n));//14
	}

	static int countWays(int n) {
		int table[] = new int[n + 1];
		Arrays.fill(table, 0);
		table[0] = 1;
		for (int i = 1; i < n; i++)
			for (int j = i; j <= n; j++)
				table[j] += table[j - i];
		return table[n];
	}
}
