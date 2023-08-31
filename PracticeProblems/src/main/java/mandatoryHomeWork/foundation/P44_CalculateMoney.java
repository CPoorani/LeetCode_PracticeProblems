package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P44_CalculateMoney {

	/*
	 * Input : Integer Output : Integer (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5
	 * + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
	 * Initialize variable total to hold the sum
	 * Initialize a variable current with 1 (Initial day starts with 1)
	 * Iterate through the input n
	 * 		Increment current by 1 for each of the iteration
	 * 		If (i%7==0)
	 * 			Change the value of current to 2 and so on by, (i/7)+1
	 * return total
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(37, saveMoney(10));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(37, saveMoney(10));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(37, saveMoney(10));
	}


	public int saveMoney(int n) {
		int total = 0;
		int current = 1;
		for (int i = 1; i <= n; i++) {
			total = total + current;
			current++;
			if (i % 7 == 0) {
				current = (i / 7) + 1;
			}
		}
		return total;

	}

}
