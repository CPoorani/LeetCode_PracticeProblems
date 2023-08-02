package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P22_ShuffleString {
	
	/*
	 * Input : String and array 
	 * Output : String
	 * Create an empty array
	 * Traverse through the input string
	 * For each of the char array index assign it with the input.charAt(i)
	 * Return the char array as String
	 */

	@Test
	public void test() {
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String actual = toShuffleString("codeleet", indices);
		Assert.assertEquals("leetcode", actual);
	}

	@Test
	public void test1() {
		int[] indices = { 0, 1, 2 };
		String actual = toShuffleString("abc", indices);
		Assert.assertEquals("abc", actual);
	}

	public String toShuffleString(String input, int[] indices) {
		char[] temp = new char[indices.length];
		for (int i = 0; i < input.length(); i++) {
			temp[indices[i]] = input.charAt(i);	
		}
		return new String(temp);
	}

}
