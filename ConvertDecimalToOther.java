package GeneralProgramming;
import java.util.Scanner;

public class ConvertDecimalToOther {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number : ");
		int inputNumber = sc.nextInt();
		int copyOfInputNumber = inputNumber;
		String binary = "";
		int rem = 0;
		// Convert Decimal To Binary :
		while (inputNumber > 0) {
			rem = inputNumber % 2;
			binary = rem + binary;
			inputNumber = inputNumber / 2;
		}
		System.out.println("Binary Equivalent of " + copyOfInputNumber + " is " + binary);

		// Convert Decimal To Octal :
		String octal = "";
		while (inputNumber > 0) {
			rem = inputNumber % 8;
			octal = rem + octal;
			inputNumber = inputNumber / 8;
		}
		System.out.println("Octal Equivalent of " + copyOfInputNumber + " is " + octal);

		// Decimal To HexaDecimal :
		String hexa = "";
		char hexaDecimals[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (inputNumber > 0) {
			rem = inputNumber % 16;
			hexa = hexaDecimals[rem] + hexa;
			inputNumber = inputNumber / 16;
		}
		System.out.println("HexaDecimal Equivalent of " + copyOfInputNumber + " is " + hexa);
	}

}
