package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P38_CountPrimes {

	@Test
	public void test() {
		Assert.assertEquals(4, countPrimes(10));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(25, countPrimes(100));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, countPrimes(1));
	}

	private boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++)
			if (n % i == 0) {
				flag = false;
			}
		return flag;

	}

	public int countPrimes(int num) {

		int count = 0;
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				count++;
			}
		}

		return count;
	}

}
