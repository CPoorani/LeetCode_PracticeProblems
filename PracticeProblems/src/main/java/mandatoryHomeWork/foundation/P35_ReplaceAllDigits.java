package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P35_ReplaceAllDigits {
	/*
	 * Input: String
	 * Output: String
	 * Convert the String to Char array
	 * Traverse through the array
	 * arr[i] = (char) (arr[i]+arr[i-1]-'0')
	 * Return the character array back to string
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals("abcdef", shiftCharacters("a1c1e1"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("abbdcfdhe", shiftCharacters("a1b2c3d4e"));
	}
	
	public String shiftCharacters(String str)
	{
		char[] arr = str.toCharArray();
		for(int i=1 ; i<arr.length; i=i+2)
		{
			arr[i] = (char) (arr[i]+arr[i-1]-'0');
		}
		return new String(arr);
		
	}

}
