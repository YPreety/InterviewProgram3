package GeneralProgramming;

import java.util.Arrays;
import java.util.HashSet;

//Find Union Of Multiple Arrays Using HashSet

public class UnionOfMultipleArrays {

	public static void main(String[] args) {
		int[] inputArray1 = { 2, 3, 4, 7, 1 };
		int[] inputArray2 = { 4, 1, 3, 5 };
		int[] inputArray3 = { 8, 4, 6, 2, 1 };
		int[] inputArray4 = { 7, 9, 4, 1 };
		union(inputArray1, inputArray2, inputArray3, inputArray4);
	}

	static void union(int[]... inputArrays) {
		HashSet<Integer> unionSet = new HashSet<Integer>();
		System.out.println("Input Arrays :");
		System.out.println("======================");
		for (int[] inputArray : inputArrays) {
			System.out.println(Arrays.toString(inputArray));
			for (int i : inputArray) {
				unionSet.add(i);
			}
		}
		System.out.println("===========================");
		System.out.println("Union Of All Input Arrays :");
		System.out.println("===========================");
		System.out.println(unionSet);
	}
}
