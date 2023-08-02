package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P27_CheckAandB {
	/*
	 * Input : String
	 * Output : Boolean
	 * Traverse through the string 
	 * If the charAt(i-1)!='b' and charAt(i)='a' then return true
	 * else
	 * return false
	 */
	
	@Test
	public void test()
	{
		boolean actual = ifAandB("aaabbb");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test1()
	{
		boolean actual = ifAandB("abab");
		Assert.assertEquals(false, actual);
	}
	
	public boolean ifAandB(String str)
	{
		for(int i=1; i<str.length(); i++)
		{
			if(str.charAt(i-1)!='b' && str.charAt(i)=='a')
			{
				return true;
			}
		}
		return false;

}}
