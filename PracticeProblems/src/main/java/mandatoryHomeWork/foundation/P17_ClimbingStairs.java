package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P17_ClimbingStairs {
	
	//https://leetcode.com/problems/climbing-stairs/description/
	
	/*
	 * Addition of the first and second equals the third output
	 * Initialize two variables as n1 and n2 to 1
	 * Traverse through the array until it equals to n
	 * Declare a temp variable 
	 * Add n1+n2 and assign it to temp 
	 * make n2=n1 and n1=temp
	 * return n1
	 */
	@Test
	public void test()
	{
		int actual = steps(4);
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test1()
	{
		int actual = steps(6);
		Assert.assertEquals(13, actual);
	}

	public int steps(int n) {

		/*
		 * 1 step = 1
		 * 2 steps = 2 
		 * 3 steps = 3
		 * 4 steps = 3+2 = 5 combinations 
		 * 5 steps = 5+3 = 8 combinations
		 * 6 steps = 13 combinations
		 */
		int n1 = 1;
		int n2 = 1;

		for (int i = 2; i <= n; i++) {
			int temp = n1 + n2;
			n2 = n1; 
			n1 = temp;
		}
		return n1;
	}

}
