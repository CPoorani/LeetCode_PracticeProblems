package dailyPrograms;

import org.junit.Assert;
import org.junit.Test;

public class P69_StringPairs {
	/*
	 * https://leetcode.com/problems/find-maximum-number-of-string-pairs/
	 * 
	 * Input: words = ["cd","ac","dc","ca","zz"] Output: 2
	 * 
	 * Input: Array
	 * Output : Int
	 * Create a helper method for string reversal 
	 * Initialize a variable count to 0
	 * Outer loop from 0 to words length ( i=0 to words.length)
	 * 	Inner loop from i+1 to words length
	 * 	Initialize two string s1 and s2, one for words[i] and other for words[j]
	 * 	If the s1 equals to the reversal of s2
	 * 		Increase the count by 1
	 * Return count
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(2, maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"}));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, maximumNumberOfStringPairs(new String[] {"ab","ba","cc"}));
	}
	public int maximumNumberOfStringPairs(String[] words) {
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				String s1 = words[i];
				String s2 = words[j];
				String reverse = toReverse(s1);

				if (s1.equals(toReverse(s2))) {
					count++;
				}
			}
		}

		return count;
	}

	public String toReverse(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			result.append(str.charAt(i));
		}
		return result.toString();
	}
}
