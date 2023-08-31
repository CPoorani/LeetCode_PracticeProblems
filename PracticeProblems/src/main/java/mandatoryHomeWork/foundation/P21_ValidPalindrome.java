package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P21_ValidPalindrome {

	/*
	 * Input : String 
	 * Output: Boolean 
	 * Replace all the alphanumeric characters
	 * Convert the string to lower case and store it in str
	 * Initialize a reverse string variable
	 * Traverse in reverse order
	 * Add each of the character in string along reverse
	 * If reverse and str, return true
	 * else return false
	 */
	@Test
	public void test()
	{
		boolean actual = checkPalindrome("A man, a plan, a canal: Panama");
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test1()
	{
		boolean actual = checkPalindrome("race a car");
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = checkPalindrome("a_aa_aa_a");
		Assert.assertEquals(true, actual);
	}
	
	public boolean checkPalindrome(String input) {

		String converted = input.replaceAll("[^a-zA-Z0-9]", "");
		String str = converted.toLowerCase();
		String rstr = "";

		for (int i = str.length()-1; i >= 0; i--) {
			rstr = rstr + str.charAt(i);
		}

		if (rstr.equals(str)) {
			return true;
		}
		return false;

	}

}
