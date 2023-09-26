package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P80_KBeautyNumber {

	/*
	 * https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/
	 * 
	 * Input : Int (Num and K)
	 * Output : int
	 * Convert the number to string
	 * Initialize a variable count and a pointer left to the position 0
	 * Iterate from the left to k
	 * Get the substring from the left to left along with k
	 * If the number is divisible by the value of substring, then increase the count
	 * Increment the pointer
	 * Return count
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(2, divisorSubstrings(430043, 2));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, divisorSubstrings(150, 3));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, divisorSubstrings(20, 3));
	}
	
	
	public int divisorSubstrings(int num, int k) {
		String str = Integer.toString(num);
		int count = 0;

		int left = 0;

		while (left + k <= str.length()) {
			String subString = str.substring(left, left + k);

			if (Integer.parseInt(subString) != 0 && num % Integer.parseInt(subString) == 0) {
				count++;
			}

			left++;
		}

		return count;
	}
}