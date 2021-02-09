package GeneralProgramming;

import java.util.Scanner;

//Find Frequency Of All Digits In Number Without Using Collection 

public class FrequencyOfDigits2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int inputNumber = sc.nextInt();
		int[] digitCount = new int[10];
		while (inputNumber != 0) {
			int lastDigit = inputNumber % 10;
			digitCount[lastDigit]++;
			inputNumber = inputNumber / 10;
		}
		System.out.println("===================");
		System.out.println("Digits : Frequency");
		System.out.println("===================");
		for (int i = 0; i < digitCount.length; i++) {
			if (digitCount[i] != 0) {
				System.out.println("   " + i + "   :   " + digitCount[i]);
			}
		}
		sc.close();
	}
}

/*
 * Enter the number : 21757132 =================== Digits : Frequency
 * =================== 1 : 2 2 : 2 3 : 1 5 : 1 7 : 2
 */