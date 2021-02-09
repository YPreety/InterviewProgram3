package GeneralProgramming;

public class AnagramUsingStringBuilder {

	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");
		isAnagram("Toss", "Shot");
		isAnagram("SiLeNt CAT", "LisTen AcT");
		isAnagram("joy", "enjoy");

	}

	static void isAnagram(String s1, String s2) {
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;

		if (copyOfs1.length() != copyOfs2.length()) {
			status = false;
		} else {
			char[] s1Array = copyOfs1.toCharArray();
			StringBuilder sb = new StringBuilder(copyOfs2);
			for (char c : s1Array) {
				int index = sb.indexOf("" + c);
				if (index != -1) {
					sb = sb.deleteCharAt(index);
				} else {
					status = false;
					break;
				}
			}
		}

		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
}
