package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class ValidPalindrome {
	
	/*
	 * Input : String, output : boolean
	 * Create functions, one for reversing and other to delete each charcter and to check if palindrome
	 * isPalindrome : Iterate the string in reverse and check if the input string equals reverseed string
	 * To find palindrome : Use String Builder, remove each character 
	 * if the reversal equals retrun true else false
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(true, (validPalindrome("ABCDCBA")));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals(false, validPalindrome("ROSSVR"));
	}
	
	public static boolean validPalindrome(String s) {
	    for (int i = 0; i < s.length(); i++) {
	        StringBuilder str = new StringBuilder(s);
	        str.deleteCharAt(i);
	        if (isPalindrome(str.toString())) {
	            return true;
	        }
	    }
	    return false;
	}

	private static boolean isPalindrome(String s) {
	    String reverse = "";
	    for (int i = s.length() - 1; i >= 0; i--) {
	        reverse = reverse + s.charAt(i);
	    }
	    return s.equals(reverse);
	}
}