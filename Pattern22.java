package GeneralProgramming;

import java.util.Scanner;

/*Here is your pattern….!!!
0000000
0100000
0020000
0003000
0000400
0000050
0000006*/
public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
