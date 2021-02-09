package GeneralProgramming;

import java.util.Scanner;

/*Transpose of a matrix is formed by turning all rows of a matrix into columns and columns into rows.
Your Matrix is :
7    2    9
1    6    3
Transpose of Matrix is :
7    1
2    6
9    3*/

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter The Number Of Columns");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		int[][] transpose = new int[cols][rows];
		System.out.println("Enter The Data For Matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your Matrix is :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("Transpose of Matrix is :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + "\t");
			}

			System.out.println();
		}
	}
}
