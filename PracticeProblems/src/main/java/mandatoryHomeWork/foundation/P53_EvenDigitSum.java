package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P53_EvenDigitSum {

	/*
	 * Input : Int (1 to 1000) 
	 * Output : Int 
	 * Initialize variable count and sum to 0
	 * Iterate through the elements of the given n
	 *  	Assign number to each index number 
	 *  	If(number>0) 
	 *  		Add sum along with the last digit of the number 
	 *  		Continue by removing the last digit
	 *  		If(sum%2 ==0)
	 *  			Increase the counter value
	 *  Return count
	 */

	@Test
	public void test() {
		Assert.assertEquals(2, digitSum(4));
	}

	@Test
	public void test1() {
		Assert.assertEquals(24, digitSum(50));
	}

	public int digitSum(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int number = i;
			int sum = 0;

			while (number > 0) {
				sum = sum + number % 10;
				number /= 10;
			}

			if (sum % 2 == 0) {
				count++;
			}
		}

		return count;
	}
}
