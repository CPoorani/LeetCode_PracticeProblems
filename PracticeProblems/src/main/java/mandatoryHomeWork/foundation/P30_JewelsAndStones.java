package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P30_JewelsAndStones {
	/*
	 * Input : String
	 * Output : Integer
	 * Have a counter variable initialized to 0
	 * Convert the Strings to char array
	 * Iterate through the stones and jewels using two loops
	 * If the value at i and j matches 
	 * Increment the count
	 * Return count
	 */
	@Test
	public void test()
	{
		int actual = jewelStones("aA", "aAAbbbb");
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test1()
	{
		int actual = jewelStones("z", "ZZ");
		Assert.assertEquals(0, actual);
	}

	public int jewelStones(String jewels, String stones) {
		char[] stone = stones.toCharArray();
		char[] jewel = jewels.toCharArray();
		int count = 0;
		for (int i = 0; i < jewel.length; i++) {
			for (int j = 0; j < stone.length; j++) {
				if (jewel[i] == stone[j]) {
					count++;
				}
			}
		}
		return count;
		

	}

}
