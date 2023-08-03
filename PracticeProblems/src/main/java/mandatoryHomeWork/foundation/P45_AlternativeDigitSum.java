package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P45_AlternativeDigitSum {
	
	/*
	 * Input : Integer
	 * Output : Integer
	 * MSB to have the positive sign and alternate sign to its adjacent digits
	 * Initialize a variable sign with 1
	 * Initialize a variable sum with 0
	 * Get the integer as String 
	 * Convert to a char array 
	 * Iterate through the the char array	
	 * 		get each of digit from the character array
	 * 		sum = sum + (sign*fetchednumericval)
	 * Alternate the sign (-1)
	 * 
	 */

	@Test
	public void test() {
		Assert.assertEquals(1, digitSum(10));

	}

	@Test
	public void test1() {
		Assert.assertEquals(1, digitSum(111));

	}

	@Test
	public void test2() {
		Assert.assertEquals(0, digitSum(886996));

	}

	public int digitSum(int n) {
		int sum = 0;
		int sign = 1;
		
		String numbers = String.valueOf(n);
		char[] digits = numbers.toCharArray(); 
		for(int i=0; i<digits.length; i++)
		{
			int eachDigit = Character.getNumericValue(digits[i]);
			sum = sum + (eachDigit*sign); 
			sign = -sign; //alternate sign
			
		}
		return sum;
	}

}
