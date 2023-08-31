package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P41_ColumnNumber {
	
	/*
	 * Input : String
	 * Output: Int
	 * Initialize a variable result
	 * Iterate through the string
	 * 		Fetch each of the character with index
	 * 		Mutiply the result with base as 26 and (char - 'A' - 1)
	 * Return result
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(704, fetchColumnNumber("AAB"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4, fetchColumnNumber("D"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(701, fetchColumnNumber("ZY"));
	}
	
	public int fetchColumnNumber(String str)
	{
		int result = 0;
		for(int i=0; i<str.length(); i++)
		{
			//result = str.charAt(i)-'A'+1;
			char c = str.charAt(i);  //A //B
	        result = result * 26 + (c - 'A' + 1); //result = 1 //result = 26+2 > 28
		}
		
		return result;
		
	}

}
