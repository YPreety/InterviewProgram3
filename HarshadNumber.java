package GeneralProgramming;

import java.util.Scanner;

/*Harshad number or Niven number is a number which is divisible by the sum of its digits. For example,

1) 21 is a Harshad number because it is divisible by the sum of its digits.

21 –> sum of digits –> 2+1 = 3 and 21 is divisible by 3 –> 21/3 = 7.*/

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number : ");
		int inputNumber = sc.nextInt();
		checkForHarshad(inputNumber);
		sc.close();
	}

	static void checkForHarshad(int inputNumber) {
		int copyOfInputNumber = inputNumber;
		int sum = 0;
		int lastDigit = 0;
		while (inputNumber != 0) {
			lastDigit = inputNumber % 10;
			sum = sum + lastDigit;
			inputNumber = inputNumber / 10;
		}
		if ((copyOfInputNumber % sum) == 0) {
			System.out.println(copyOfInputNumber + " is a Harshad number");
		} else {
			System.out.println(copyOfInputNumber + " is not a Harshad number");
		}
	}
}
