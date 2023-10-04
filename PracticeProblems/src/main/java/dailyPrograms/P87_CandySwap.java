package dailyPrograms;

import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class P87_CandySwap {
	
	/*
	 * Input : Array
	 * Output : Array
	 * Iterate through the length of alice and bob
	 * Initialize variables sumA and sumB
	 * Add up the value in each array, sum of a and b 
	 * Get the difference between sumA and sumB and by 2
	 * Initialize a variable sizeB
	 * Iterate through the alice size, get the difference of each element of alice
	 * Iterate through the bob size, if the element matches, then return a and b
	 * else return 
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(new int[]{2, 3}, fairCandySwap(new int[] {2}, new int[] {1, 3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(new int[]{1, 2}, fairCandySwap(new int[] {1, 2}, new int[] {2,3}));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(new int[]{3, 1}, fairCandySwap(new int[] {2, 3, 4, 5}, new int[] {1, 5, 3}));
	}

	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) { //[1, 2] [2, 3] -- 3 + 5 = 8/2 = 4
		
		int sumA = 0, sumB = 0;
		for (int i = 0; i < aliceSizes.length || i < bobSizes.length; i++) {
			if (i < aliceSizes.length) {
				sumA += aliceSizes[i];
			}
			if (i < bobSizes.length) {
				sumB += bobSizes[i];
			}
		}

		int diff = (sumA - sumB) / 2;

		for (int a : aliceSizes) {
			int sizeB = a - diff;
			for (int b : bobSizes) {
				if (b == sizeB) {
					return new int[] { a, b };
				}
			}
		}

		return new int[] {};
	}

}
