package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P24_FirstPalindromic {
	
	/*
	 * Input : Array
	 * Output : String
	 * Traverse through the words 
	 * Initialize a variable rstr to preserve the fetched value
	 * For each of the word, run a for loop in reverse order and add the character along with rstr
	 * If the current word and the rstr match
	 * Return word 
	 * else
	 * Return null
	 */

	@Test
	public void test() {
		String[] words = {"abc", "car", "ada", "racecar", "cool"};
		Assert.assertEquals("ada", isPalindrome(words));
	}
	
	@Test
	public void test1() {
		String[] words = {"notapalindrome","racecar"};
		Assert.assertEquals("racecar", isPalindrome(words));
	}
	
	@Test
	public void test2() {
		String[] words = {"def","ghi"};
		Assert.assertEquals("", isPalindrome(words));
	}

	public String isPalindrome(String[] words) {
		// words = ["abc","car","ada","racecar","cool"]

		for (String word : words) {
			String rstr = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rstr += word.charAt(i);
			}
			if (word.equals(rstr)) {
				return word;
			}
		}
		return "";
	}

}
