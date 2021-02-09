package GeneralProgramming;
import java.util.Scanner;

//java program to count the number of words in a string?
public class CountTheWords1 {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.trim().split(" ");
		System.out.println("Number of words in the string = " + words.length);
	}
}
