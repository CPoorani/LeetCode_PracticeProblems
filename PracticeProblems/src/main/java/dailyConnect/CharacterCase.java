package dailyConnect;

import org.junit.Assert;
import org.junit.Test;

public class CharacterCase {
	@Test
	public void test()
	{
		Assert.assertEquals(1, checkCharacterCase('A'));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, checkCharacterCase('g'));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(-1,checkCharacterCase('&'));
	}
	
	public int checkCharacterCase(char c)
	{
		if(c>=65 && c<=90)
		{
			return 1;
		}
		else if(c>=97 && c<=122)
		{
			return 0;
		}
		return -1;
		
	}
}