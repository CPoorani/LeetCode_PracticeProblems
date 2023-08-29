package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class BalancedStrings {
	
	/*
	 * Input : String
	 * Output : Int
	 * Initialize a counter variable and balanced variable to 0 -- to find the substring and count of R and L
	 * Increase if the occurrence has 'R'and decrease the string has 'L'
	 * If the count is 0, increase the balanced count and return
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(4, balancedStringSplit("RLRRLLRLRL"));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals(0, balancedStringSplit("RRRRRR"));
	}
	
    public int balancedStringSplit(String s) {

 	int count = 0;
		int balancedCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				count++;
			} else if (s.charAt(i) == 'L') {
				count--;
			}

			if (count == 0) {
				balancedCount++;
			}
		}

		return balancedCount;
	}
}
        


