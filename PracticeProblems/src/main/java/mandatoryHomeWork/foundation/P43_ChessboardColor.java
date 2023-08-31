package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P43_ChessboardColor {
	
	/*
	 * Input : String
	 * Output: Boolean 
	 * Convert the first character to number 
	 * Second represents the number as per the given input
	 * Calculate the coordinates. (column : 0 to 7) (row : 1 to 8) EX. 7+3 = 10 ==> h3
	 * If adding the two index equals zero, then the color is white (true)
	 * else black (false)
	 * 
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(false, checkColor("a1"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, checkColor("c7"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, checkColor("h3"));
	}

	public boolean checkColor(String coordinates) {
		int letter = coordinates.charAt(0) - 'a';
		int number = Character.getNumericValue(coordinates.charAt(1));
		if ((letter + number) % 2 == 0) {
			return true;
		}
		return false;

	}
}
