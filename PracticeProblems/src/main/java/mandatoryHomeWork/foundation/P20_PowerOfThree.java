package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P20_PowerOfThree {

	/*
	 * Input : Integer 
	 * Output : Boolean
	 * Use a function math.pow(number, exponent) 
	 * If it equals to 0, return tru
	 * else
	 * return false
	 */
	
	@Test
	public void test() {
		boolean actual = cubes(27);
		Assert.assertEquals(true, actual);
	}

	@Test
	public void test1() {
		boolean actual = cubes(0);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2() {
		boolean actual = cubes(-1);
		Assert.assertEquals(false, actual);
	}

	public boolean cubes(int n) {
		while (n > 3) {
			boolean result = (Math.pow(n, 3) == 0);
			return true;

		}
		return false;

	}

}
