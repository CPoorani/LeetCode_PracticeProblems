package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P68_ReverseWords {
	
	/*
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
	 * 
	 * Input : String, Output : String
	 * Split using spaces 
	 * Create a string builder
	 * Traverse through the words
	 * 	Assign each of the word to a string
	 * 		Iterate through the string in reverse 
	 * Append the reversed string along with the space
	 * Convert to string object, trim and return
	 */
	@Test
	public void test()
	{
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals("doG gniD", reverseWords("God Ding"));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("edocteel", reverseWords("leetcode"));
	}
	public String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			String toReverse = words[i];
			String result = "";
			for (int j = toReverse.length() - 1; j >= 0; j--) {
				result = result + toReverse.charAt(j);
			}
			str.append(result).append(" ");
		}

		return str.toString().trim();

	}
}