package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P11_PalindromeNumber {

	// https://leetcode.com/problems/palindrome-number/description/

	/*
	 * Input : Integer 
	 * Output : Boolean 
	 * Convert the given array to string 
	 * Initialize a variable temp to preserve the fetched value
	 * Iterate in reverse order temp = temp + charAt(index); 
	 * If the given temp matches with the converted value return true else return false
	 */
	@Test
	public void test()
	{
		boolean actual = isPalindrome(121);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test1()
	{
		boolean actual = isPalindrome(-121);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = isPalindrome(10);
		Assert.assertEquals(false, actual);
	}

	public boolean isPalindrome(int number) {
		String value = Integer.toString(number);
		String temp = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			temp = temp + value.charAt(i);
		}
		if(temp.equals(value))
		{
			return true;
		}
		return false;


	}
}
