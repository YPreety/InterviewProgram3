package Dynamic_Programming;

/*Count of n digit numbers whose sum of digits equals to given sum
Input:  n = 2, sum = 2
Output: 2
Explanation: Numbers are 11 and 20

Input:  n = 2, sum = 5
Output: 5
Explanation: Numbers are 14, 23, 32, 41 and 50*/
public class CounNDigitNumbers {

	public static void main(String[] args) {
		int n = 2, sum = 5;
		System.out.println(finalCount(n, sum));//5
	}

	static int countRec(int n, int sum) {
		if (n == 0)
			return sum == 0 ? 1 : 0;
		if (sum == 0)
			return 1;
		int ans = 0;
		for (int i = 0; i <= 9; i++)
			if (sum - i >= 0)
				ans += countRec(n - 1, sum - i);
		return ans;
	}
	static int finalCount(int n, int sum) {
		int ans = 0;
		for (int i = 1; i <= 9; i++)
			if (sum - i >= 0)
				ans += countRec(n - 1, sum - i);
		return ans;
	}
}
