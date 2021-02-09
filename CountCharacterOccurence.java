package GeneralProgramming;
//Write a java program to count the total number of occurrences of a given character in a string without using any loop?
public class CountCharacterOccurence {

	public static void main(String[] args) {
		String s = "Java is java again java again";
		char c = 'a';
		int count = s.length() - s.replace("a", "").length();
		System.out.println("Number of occurances of 'a' in " + s + " = " + count);
	}
}
