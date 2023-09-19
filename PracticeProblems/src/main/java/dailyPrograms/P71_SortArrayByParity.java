package dailyConnect;

import org.junit.Assert;
import org.junit.Test;

public class P71_SortArrayByParity {
	
	/*
	 * Input : Array
	 * Output : Array
	 * Initialize two variables left and right
	 * If the pointer at left is odd, then increment the left pointer and right remains the same
	 * If the left is not odd and right is odd, do the swap and check again
	 * If the right is odd, then decrement the pointer
	 * return the array
	 */

	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] { 4, 2, 1, 3 }, sortArrayByParity(new int[] { 3, 1, 2, 4 }));
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] { 6, 12, 28, 14, 15 }, sortArrayByParity(new int[] { 6, 12, 15, 14, 28}));
	}

	public int[] sortArrayByParity(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}

			if (nums[left] % 2 == 0) {
				left++;
			}

			if (nums[right] % 2 != 0) {
				right--;
			}
		}

		return nums;
	}
}