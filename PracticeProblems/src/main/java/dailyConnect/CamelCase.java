package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class CamelCase {
	
	/*
	 * Input : String 
	 * Output : Int
	 * Initialize a variable count to 1 (first word always starts with lowercase)
	 * Iterate through the string
	 * 	Check if the character is uppercase for each of the index position
	 * 	If so, increase the value of count by 1
	 * Return count
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(1, "singleword");
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, "oneTwoThree");
	}

	public int camelcase(String s) {
		int words = 1;
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				words++;
			}
		}
		return words;
	    

	    }
}
