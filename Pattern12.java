package GeneralProgramming;

import java.util.Scanner;

/*Here is your pattern….!!!
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1*/
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
