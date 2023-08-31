package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P7_PrimeNumbers {

	/*
	 * Declare a variable number 
	 * Iterate through the numbers
	 * If the number is
	 * divisible by 1 and then by the number itself 
	 * 		---> return true 
	 * 		else 
	 * 		--->return false 
	 * If the value of number == 0 or 1 ---> return false
	 */
	@Test
	public void test() {
		boolean actual = isPrimeNumber(15);
		Assert.assertEquals(false, actual);

	}
	
	@Test
	public void test1() {
		boolean actual = isPrimeNumber(7);
		Assert.assertEquals(true, actual);

	}

	public boolean isPrimeNumber(int number) {
		if(number < 2)
		{
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}
}
