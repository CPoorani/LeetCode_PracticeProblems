package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class H02_HalloweenParty {

	/*
	 * https://www.hackerrank.com/challenges/halloween-party/problem
	 * 
	 * Input : int
	 * Output : long
	 * horizontal cuts - given input by 2
	 * vertical cuts - difference of input and horizontal
	 * multiply the vertical and horizontal to get the total
	 * Return total
	 */

	@Test
	public void test() {
		Assert.assertEquals(4, halloweenParty(4));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(225, halloweenParty(30));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(6, halloweenParty(5));
	}

	public long halloweenParty(int k) {
		long total = 0;
		int rem = k / 2;
		int q = k - rem;
		total = (long) rem * q;

		
		return total;
	}
}
