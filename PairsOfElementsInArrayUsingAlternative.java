package GeneralProgramming;

import java.util.Arrays;

public class PairsOfElementsInArrayUsingAlternative {

	public static void main(String[] args) {
		findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
	}

	static void findThePairs(int inputArray[], int inputNumber) {
		Arrays.sort(inputArray);
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
		int i = 0;
		int j = inputArray.length - 1;
		while (i < j) {
			if (inputArray[i] + inputArray[j] == inputNumber) {
				System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				i++;
				j--;
			} else if (inputArray[i] + inputArray[j] < inputNumber) {
				i++;
			} else if (inputArray[i] + inputArray[j] > inputNumber) {
				j--;
			}
		}
	}
}
