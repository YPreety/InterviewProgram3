package GeneralProgramming;

import java.util.Arrays;

//Java Program To Find Continuous Sub Array In Array Whose Sum Is Equal To Number :
public class SubArrayWhoseSumIsNumber1 {

	public static void main(String[] args) {
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);
	}

	static void findSubArray(int[] inputArray, int inputNumber) {
		int sum = inputArray[0];
		int start = 0;
		for (int i = 1; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
			while (sum > inputNumber && start <= i - 1) {
				sum = sum - inputArray[start];
				start++;
			}
			if (sum == inputNumber) {
				System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is "
						+ inputNumber + " is ");
				for (int j = start; j <= i; j++) {
					System.out.print(inputArray[j] + " ");
				}
				System.out.println();
			}
		}
	}
}
