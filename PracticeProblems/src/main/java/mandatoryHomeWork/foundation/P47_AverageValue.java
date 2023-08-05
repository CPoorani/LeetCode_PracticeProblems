package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P47_AverageValue {

	/*
	 * Input : Array 
	 * Output : Integer 
	 * Create an empty list 
	 * Iterate through the array
	 * 	a) If a number is divisible by 6 (nums[i]%6 ==0), then add it to the list
	 * Initialize a variable sum with 0
	 * Iterate through the list and calculate the sum
	 * If the list is empty, 
	 * 	return 0
	 * else
	 * 	sum/list.size()
	 */

	@Test
	public void test() {
		int[] nums = { 1, 3, 6, 10, 12, 15 };
		Assert.assertEquals(9, divisibleByThree(nums));
	}

	@Test
	public void test1() {
		int[] nums = { 1, 2, 4, 7, 10 };
		Assert.assertEquals(0, divisibleByThree(nums));
	}

	@Test
	public void test2() {
		int[] nums = { 9, 3, 8, 4, 2, 5, 3, 8, 6, 1 };
		Assert.assertEquals(6, divisibleByThree(nums));
	}

	public int divisibleByThree(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 6 == 0) //divisible by 3 and 2
			{
				list.add(nums[i]);
			}
		}

		if (list.isEmpty()) {
			return 0;
		}
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		return sum / list.size();
	}

}
