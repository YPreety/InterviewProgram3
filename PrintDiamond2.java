package GeneralProgramming;

import java.util.Scanner;

/*Here Is Your Diamond : 
    1
   2 2
  3 3 3
 4 4 4 4
  3 3 3
   2 2
    1
 */
public class PrintDiamond2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows You Want In Your Diamond?");
		int noOfRows = sc.nextInt();
		int midRow = noOfRows / 2;
		int row = 1;
		System.out.println("Here Is Your Diamond : ");
		for (int i = midRow; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= row; j++) {
				System.out.print(row + " ");
			}
			System.out.println();
			row++;
		}
		for (int i = 0; i <= midRow; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = row; j > 0; j--) {
				System.out.print(row + " ");
			}
			System.out.println();
			row--;
		}
	}
}
