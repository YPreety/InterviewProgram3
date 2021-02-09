package Dynamic_Programming;

/*Recursively break a number in 3 parts to get maximum sum
Given a number n, we can divide it in only three parts n/2, n/3 and n/4 (we will consider only integer part). The task is to find the maximum sum we can
make by dividing number in three parts recursively and summing up them together.
Input : n = 12
Output : 13
*/
//A simple recursive JAVA program to find maximum sum by recursively breaking a number in 3 parts.
public class RecursivelBreakNumber {

	public static void main(String[] args) {
		int n = 12;
		System.out.println(breakSum(n)); //13
	}

	static int breakSum(int n) {
		if (n == 0 || n == 1)
			return n;
		return Math.max((breakSum(n / 2) + breakSum(n / 3) + breakSum(n / 4)), n);
	}
}
