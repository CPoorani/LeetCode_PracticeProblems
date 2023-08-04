package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P46_ArraySign {
	
	/*
	 * Input : int array
	 * Output : int
	 * Initialize a product variable to 1
	 * Iterate through the array
	 * 		product*=nums[i]
	 * If product>0 
	 * 		return 1
	 * else if product<0
	 * 		return -1
	 * else
	 * 		return 0
	 * 
	 * The above fails for few test cases in LeetCode
	 * 
	 * Input : int array
	 * Output : int
	 * Initialize a counter variable to 1
	 * Iterate through the array
	 * 		if nums[i]=0
	 * 			return 0
	 * else check the negative numbers
	 * 			Increase count by 1
	 * if(count%2 ==0)
	 * 	return 1
	 * else
	 * 	return -1
	 */

	@Test
	public void test() {
		int[] nums = { -1, -2, -3, -4, 3, 2, 1 };
		Assert.assertEquals(1, productArray(nums));
	}

	@Test
	public void test1() {
		int[] nums = { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
		Assert.assertEquals(-1, productArray(nums));
	}

	@Test
	public void test3() {
		int[] nums = { 1, 5, 0, 2, -3 };
		Assert.assertEquals(0, productArray(nums));
	}

	public int productArray(int[] nums) {
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			product = product * nums[i];
		}

		if (product > 0) {
			return 1;
		}

		else if (product < 0) {
			return -1;
		}

		else {
			return 0;
		}
	}

	public int arraySign(int[] nums) {
		int count = 0;
		boolean hasZero = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				return 0;
			} else if (nums[i] < 0) {
				count++;
			}
		}

		if (count % 2 == 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
