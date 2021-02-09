package GeneralProgramming;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "2015";
		// Using Integer.parseInt() method
		int i = Integer.parseInt(s);
		System.out.println(i);

		// Using Integer.valueOf() method
		String s1 = "2015";
		int i1 = Integer.valueOf(s1);
		System.out.println(i1);
	}
}
