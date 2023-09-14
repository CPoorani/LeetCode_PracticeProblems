package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class SumOfSquares {
	/*
	 * Input : Array
	 * Output : int
	 * Iterate through the array length
	 * Initialize a variable result to 0
	 * 	if nums.length % index ==0
	 * 	 Multiply the numbers (i-1) and add it with result
	 * return result
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(21, sumOfSquares(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(63, sumOfSquares(new int[] {2,7,1,19,18,3}));
	}

	public int sumOfSquares(int[] nums) {
		int result = 0;
		int n = nums.length;
		for (int i = 1; i <=n; i++) {
			if (n % i == 0) {
				result = result + nums[i-1] * nums[i-1];
			}
		}
		return result;
	}
}
