package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P10_MatchesPlayed {
	
	@Test
	public void test()
	{
		Assert.assertEquals(6, matches(7));
	}
	
	
	//O(log n)
	public int matches(int n) {
		int matches = 0;
		while (n > 1) {
			matches = matches + n/2;
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n - 1) / 2 + 1;
			}
		}
		return matches;

	}

}
