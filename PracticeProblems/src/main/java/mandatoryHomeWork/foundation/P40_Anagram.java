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
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, isAnagram("anagram", "marganaa"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, isAnagram("tca", "cat"));
	}
	
	/*
	 * Convert the string to lower case
	 * Have two variables to have the int values of first and second string
	 * Iterate through the first string 
	 * 	add the first string along with each of the char(i) to calculate the sum
	 * Repeat the same for second string
	 * If the sum value matches for both, return true
	 * else return false
	 */
	
	//22-08-23
	public boolean isAnagramCheck(String a, String b)
	{
		String s1 = a.toLowerCase();
		String s2 = b.toLowerCase();
		int firstString = 0;
		int secondString = 0;
		for(int i=0; i<s1.length(); i++)
		{
			firstString = firstString + (int) s1.charAt(i); 
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			secondString = secondString + (int) s2.charAt(i); 
		}
	
		return firstString == secondString;

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
