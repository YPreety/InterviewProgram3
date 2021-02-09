package GeneralProgramming;

import java.util.Arrays;

public class SeparateZerosFromNonZeros2 {

	public static void main(String[] args) {
		moveZerosToFront(new int[] { 12, 0, 7, 0, 8, 0, 3 });
	}

	static void moveZerosToFront(int inputArray[]) {
		int counter = inputArray.length - 1;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter--;
			}
		}
		while (counter >= 0) {
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(inputArray));
	}
}
