package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P84_ReverseStringII {
	
	/*
	 * Input : String and int
	 * Output : String
	 * Initialize a StringBuilder sb
	 * Initialize a variable reverse with true
	 * Iterate through the string from i to k
	 * Get the substring and if the reversal is true then reverse the substring
	 * else append it with str, change the reverse to false and continue the same
	 * return str as String object
	 */
	@Test
	public void test() {
		Assert.assertEquals("bacdfeg", reverseStr("abcdefg", 2));
	}

	@Test
	public void test1() {
		Assert.assertEquals("dcbaefghji", reverseStr("abcdefghij", 4));
	}

	public String reverseStr(String s, int k) {

		StringBuilder sb = new StringBuilder();
		boolean reverse = true;

		for (int i = 0; i < s.length(); i += k) {
			StringBuilder str = new StringBuilder(s.substring(i, Math.min(i + k, s.length())));

			if (reverse) {
				sb.append(str.reverse());
			} else {
				sb.append(str);
			}

			reverse = (reverse == true) ? false : true;
		}

		return sb.toString();
	}
}