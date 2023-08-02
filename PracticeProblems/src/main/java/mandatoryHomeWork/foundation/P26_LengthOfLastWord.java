package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P26_LengthOfLastWord {
	
	/*
	 * Input : String
	 * Output : Integer
	 * Trim the string
	 * Traverse in a reverse order 
	 * If charAt(i) is not equal to a space
	 * Count the characters 
	 * Store it in length 
	 * else
	 * break
	 */
	
	@Test
	public void test()
	{
		int actual = findLength("Hello World");
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test1()
	{
		int actual = findLength("   fly me   to   the    moon  ");
		Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = findLength("luffy is still joyboy");
		Assert.assertEquals(6, actual);
	}

	public int findLength(String s) {
		int length = 0;
		String str = s.trim();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				length++;
			}
			else
			{
				break;
			}
		}
		return length;

	}

}
