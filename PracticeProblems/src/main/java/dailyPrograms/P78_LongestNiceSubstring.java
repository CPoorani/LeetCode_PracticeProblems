package dailyPrograms;

import org.junit.Assert;
import org.junit.Test;

public class P78_LongestNiceSubstring {
	/*
	 * https://leetcode.com/problems/longest-nice-substring/
	 * Input : String
	 * Output : String
	 * 
	 * Initialize a variable called result to an empty string.
	 * Iterate from 0 to length of the string -1.
	 * Inner loop from i + 1 to the end of the string.
	 * substring from i to j.
	 * Create a flag variable and set it to true
	 * Convert the substring to char array and loop through it
	 * If "c" is a lowercase letter and the substring does not contain any uppercase, set "flag" to false.
	 * Same as above for uppercase as well
	 * if flag is true and the length is longer than the current, update the result string
	 * return result.
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals("aAa", longestNiceSubstring("YazaAay"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("cC", longestNiceSubstring("aabbAAbcCYBB"));
	}

	public String longestNiceSubstring(String s) {
		String result = "";
		int n = s.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String substring = s.substring(i, j);
				boolean flag = true;
				for (char c : substring.toCharArray()) {
					if (Character.isLowerCase(c) && !substring.contains(Character.toString(Character.toUpperCase(c)))) {
						flag = false;
						break;
					}
					if (Character.isUpperCase(c) && !substring.contains(Character.toString(Character.toLowerCase(c)))) {
						flag = false;
						break;
					}
				}
				if (flag && substring.length() > result.length()) {
					result = substring;
				}
			}
		}

		return result;
	}
}

