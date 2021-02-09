package Dynamic_Programming;

/*Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n.
For example, if length of the rod is 8 and the values of different pieces are given as following, 
then the maximum obtainable value is 22*/
/*length   | 1   2   3   4   5   6   7   8  
--------------------------------------------
price    | 1   5   8   9  10  17  17  20
 if the prices are as following, then the maximum obtainable value is 24
length   | 1   2   3   4   5   6   7   8  
--------------------------------------------
price    | 3   5   8   9  10  17  17  20*/

public class CuttingRod1 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
		int size = arr.length;
		System.out.println("Maximum Obtainable Value is " + cutRod(arr, size));
	}

	static int cutRod(int price[], int n) {
		if (n <= 0)
			return 0;
		int max_val = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++)
			max_val = Math.max(max_val, price[i] + cutRod(price, n - i - 1));

		return max_val;
	}
}
