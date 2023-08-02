package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P5_BuyandSellStock {
	
	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	
	/*
	 * Input : integer array 
	 * Output : integer
	 * Iterate two loop -- one for i and another as i+1
	 * i -- will be as buying price and j -- selling price
	 * Get the difference between selling price and buying price and assign it to current
	 * if (current > profit)
	 * 		then the profit will be assigned to a new value
	 * Return profit
	 */
	@Test
	public void test() {
		int actual = maximumProfit(new int[] { 7, 1, 5, 3, 6, 4 });
		Assert.assertEquals(5, actual);
	}

	@Test
	public void test1() {
		int actual = maximumProfit(new int[] { 7, 6, 4, 3, 1 });
		Assert.assertEquals(0, actual);
	}

	public int maximumProfit(int[] arr) {
		int profit = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				// selling price - buying price
				int current = arr[j] - arr[i]; // current for first iteration 7-1 = 6

				if (current > profit) { // 6 > 0 -- Profit = 6 ;
					profit = current;
				}

			}
		}
		return profit;
	}

}
