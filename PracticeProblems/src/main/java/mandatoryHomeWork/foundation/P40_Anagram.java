package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P40_Anagram {
	/*
	 * Input: Two Strings
	 * Output : Boolean
	 * Have an array with size 128
	 * Iterate through the first String s and capture the occurrences
	 * Iterate through the second String t and reduce the count if the character already exist
	 * Traverse through the array 
	 * If the count is not equal to 0 -- return false
	 * else
	 * return true
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(true, isAnagram("anagram", "nagaram"));
	}

	public boolean isAnagram(String s, String t) {
		int[] characters = new int[128]; //value will be as 0
		for (int i = 0; i < s.length(); i++) {
			characters[s.charAt(i)]++;
		}
		for (int i = 0; i < t.length(); i++) {
			characters[t.charAt(i)]--;
		}

		for (int count : characters) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

}
