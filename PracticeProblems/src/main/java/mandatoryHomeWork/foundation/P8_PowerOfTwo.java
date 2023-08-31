package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P8_PowerOfTwo {

	@Test
	public void test() {
		boolean actual = twoPowers(16);
		Assert.assertEquals(true, actual);
	}

	public boolean twoPowers(int n) {
		while (n % 2 == 0) { 
			n = n / 2;
		}
		if (n == 1) {
			return true;
		}
		return false;

	}

}
