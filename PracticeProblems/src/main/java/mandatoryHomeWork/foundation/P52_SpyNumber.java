package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P52_SpyNumber {
	
	/*
	 * Input : int 
	 * Output : boolean
	 * Initialize a variable digit
	 * Initialize sum to 0 and product to 1
	 * If number>0
	 * 	Extract the last digit using modulo (number%10) and store it in digit
	 * 	For sum, sum + digit
	 * 	For product, product*digit
	 * return sum==product
	 * 
	 * Using String, convert the number to string
	 * Initialize sum to 0 and product to 1
	 * Iterate through the string length
	 * 	For each digit (i), fetch the number value
	 * 	For sum, sum + digit
	 * 	For product, product*digit
	 * return sum==product
	 */
	
	@Test
	public void test()
	{
		boolean actual = isSpyNumber(132);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = spyNumberCheck(-1124);
		Assert.assertEquals(false, actual);
	}
	
	public boolean spyNumberCheck(int num)
	{
		int sum = 0;
		int product = 1;
		while(num>0)
		{
			int digit = num%10;
			sum+=digit;
			product*=digit;
			num = num/10;
			
		}
		
		return sum == product;
	}
	
	public boolean isSpyNumber(int num) {
		String numbers = String.valueOf(num);
		int sum = 0;
		int product = 1;
		for (int i = 0; i < numbers.length(); i++) {
			int digit = Character.getNumericValue(numbers.charAt(i));
			sum += digit;
			product *= digit;
		}
		return sum == product;

	}

}
