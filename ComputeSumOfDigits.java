package Dynamic_Programming;

//Compute sum of digits in all numbers from 1 to n
/*Input: n = 5
Output: Sum of digits in numbers from 1 to 5 = 15

Input: n = 12
Output: Sum of digits in numbers from 1 to 12 = 51*/
public class ComputeSumOfDigits {

	public static void main(String[] args) {
		int n = 328;
		System.out.println("Sum of digits in numbers" + " from 1 to " + n + " is " + sumOfDigitsFrom1ToN(n));//Sum of digits in numbers from 1 to 328 is 3241
	}

	static int sumOfDigitsFrom1ToN(int n) {
		int result = 0; 
		for (int x = 1; x <= n; x++)
			result += sumOfDigits(x);
		return result;
	}

	static int sumOfDigits(int x) {
		int sum = 0;
		while (x != 0) {
			sum += x % 10;
			x = x / 10;
		}
		return sum;
	}
}
