package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P66_FaultyKeyboard {
	
	/*
	 * Input : String, Output : String
	 * Create a String builder result
	 * Iterate through the given input string
	 * 	if the index has 'i', reverse the string from the previous index
	 * 	else append the result with the character
	 * Return result as string
	 */
	
	@Test
	public void test()
	{
		String expected = "ponter";
		Assert.assertEquals(expected, finalString("poiinter"));
	}
	
	@Test
	public void test1()
	{
		String expected = "";
		Assert.assertEquals(expected, finalString("iiii"));
	}
	
	@Test
	public void test2()
	{
		String expected = "string";
		Assert.assertEquals(expected, finalString("rtsng"));
	}

	public String finalString(String s) {

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'i') {
				result.reverse();
			} else {
				result.append(s.charAt(i));
			}

		}
		return result.toString();
	}
}