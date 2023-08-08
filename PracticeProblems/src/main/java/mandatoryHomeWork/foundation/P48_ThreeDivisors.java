package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P48_ThreeDivisors {

	@Test
	public void test() {
		Assert.assertEquals(false, isThree(2));
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, isThree(4));
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, isThree(4489));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, checkDivisors(9));
	}

	/* 
	 * 2 ==> 1, 2
	 * 5 ==> 1, 5
	 * 7 ==> 1, 7
	 * 11 ==> 1, 11
	 * 
	 * Non-prime 4 ==> 1, 2, 4
	 * 9 ==> 1, 3, 9
	 * 4489 ==> 1, 67, 4489 >> sqrt of 67
	 */

	/*
	 * Input : Integer
	 * Output : Boolean
	 * Initialize a counter variable to 0
	 * if n<4
	 * 	return false
	 * else
	 * 	Iterate through the number (n)
	 * if(number%i == 0)
	 * 	Increase the count
	 * if count==3
	 *	 return true
	 * else
	 *	 return false
	 */

	public boolean isThree(int n) {
		int count = 0;
		if (n < 4) {
			return false;
		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 3;
	}

	/*
	 * If n==1, return false as 1*1 will not be lesser than n
	 * Calculate the sqrt of the given input
	 * Perfect squares are the numbers that has 3 divisors, hence if the sqrt*sqrt<n
	 * 	return false
	 * Iterate through the numbers
	 * 	if(number%i ==0)
	 * 		return false 
	 * else
	 * 		return true
	 * 
	 */

	public boolean checkDivisors(int n) {
		if (n == 1) {
			return false;
		}
		int sqrt = (int) Math.sqrt(n);
		if (sqrt * sqrt < n) {
			return false;
		}
		for (int i = 2; i <= sqrt / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
