package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P3_ArrangingCoins {
	
	//https://leetcode.com/problems/arranging-coins/description/

	/*
	 * Get the Input value 
	 * Using for loop to iterate i should be start with 1 till element the n 
	 * consider 1 
	 * if(i<balance){ 
	 * variable balance to be declared n-i n
	 * =10 10-1 = 9 variable count++ to increase the completed rows
	 */
	@Test
	public void test()
	{
		int actual = arrangeCoins(6);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}

	public int arrangeCoins(int n) { 
		int balanceCoins = 0, count = 0;
		for (int i = 1; i < n; i++) {  
			balanceCoins = n - i;
			if (i < balanceCoins) {

				count++;
			}

		}
		return count;

	}

}
