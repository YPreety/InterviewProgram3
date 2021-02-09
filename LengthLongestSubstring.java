package Dynamic_Programming;

/*Length of the longest substring without repeating characters
Given a string, find the length of the longest substring without repeating characters.
For example, the longest substrings without repeating characters for “ABDEFGABEF” are “BDEFGA” and “DEFGAB”, with length 6.

Time Complexity: O(n + d)  Auxiliary Space: O(d)*/

public class LengthLongestSubstring {

	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		String str = "ABDEFGABEF";
		System.out.println("The input string is " + str); //ABDEFGABEF
		int len = longestUniqueSubsttr(str);
		System.out.println("The length of " + "the longest non repeating character is " + len);  //6
	}

	static int longestUniqueSubsttr(String str) {
		int n = str.length();
		int cur_len = 1; 
		int max_len = 1; 
		int prev_index; 
		int i;
		int visited[] = new int[NO_OF_CHARS];
		for (i = 0; i < NO_OF_CHARS; i++) {
			visited[i] = -1;
		}
		visited[str.charAt(0)] = 0;
		for (i = 1; i < n; i++) {
			prev_index = visited[str.charAt(i)];
			if (prev_index == -1 || i - cur_len > prev_index)
				cur_len++;
			else {
				if (cur_len > max_len)
					max_len = cur_len;
				cur_len = i - prev_index;
			}
			visited[str.charAt(i)] = i;
		}
		if (cur_len > max_len)
			max_len = cur_len;
		return max_len;
	}
}
