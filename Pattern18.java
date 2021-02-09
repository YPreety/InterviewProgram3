package GeneralProgramming;

import java.util.Scanner;

/*Here is your pattern....!!!
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7*/
public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
