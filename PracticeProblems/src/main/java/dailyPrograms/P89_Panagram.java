package dailyPrograms;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P89_Panagram {
	
	/*
	 * Create an empty hashset
	 * Iterate through the sentence and add the characters to set
	 * Return true if the size of the set is 26, else false
	 * 
	 * Create an int array with size 26
	 * Iterate through the sentence
	 * Increment the character count, iterate through the array and if the count is lesser than 1, return false else true
	 */

	public boolean checkPangram(String sentence)
	{
		Set<Character> set = new HashSet<>();
		for(char ch : sentence.toCharArray())
		{
			set.add(ch);
		}
		 return set.size() == 26;
	}

	public boolean checkIfPangram(String sentence) {
		int[] charCount = new int[26];

		for (char c : sentence.toCharArray()) {
			if (Character.isLetter(c)) {
				charCount[c - 'a']++;
			}
		}

		for (int count : charCount) {
			if (count < 1) {
				return false;
			}
		}

		return true;
	}
	@Test
	public void test()
	{
		Assert.assertEquals(true, checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, checkIfPangram("leetcode"));
	}
	
	
}