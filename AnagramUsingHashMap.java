package GeneralProgramming;

import java.util.HashMap;

public class AnagramUsingHashMap {

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
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < copyOfs1.length(); i++) {
				char charAsKey = copyOfs1.charAt(i);
				int charCountAsValue = 0;
				if (map.containsKey(charAsKey)) {
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, ++charCountAsValue);
				charAsKey = copyOfs2.charAt(i);
				charCountAsValue = 0;
				if (map.containsKey(charAsKey)) {
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, --charCountAsValue);
			}
			for (int value : map.values()) {
				if (value != 0) {
					status = false;
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
