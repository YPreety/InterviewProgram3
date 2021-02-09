package GeneralProgramming;

import java.util.Arrays;

public class RemoveDuplicatesElements {

	public static void main(String[] args) {
		removeDuplicates(new int[] { 4, 3, 2, 4, 9, 2 });
	}

	static void removeDuplicates(int[] arrayWithDuplicates) {
		System.out.println("Array With Duplicates : ");
		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			System.out.print(arrayWithDuplicates[i] + "\t");
		}
		int noOfUniqueElements = arrayWithDuplicates.length;
		for (int i = 0; i < noOfUniqueElements; i++) {
			for (int j = i + 1; j < noOfUniqueElements; j++) {
				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];
					noOfUniqueElements--;
					j--;
				}
			}
		}
		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		System.out.println();
		System.out.println("Array Without Duplicates : ");
		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			System.out.print(arrayWithoutDuplicates[i] + "\t");
		}
		System.out.println();
		System.out.println("==============================");
	}
}
