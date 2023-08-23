package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class H01_Handshake {
	
	/*hackerrank.com/challenges/handshake/problem
	 * Input : Int
	 * Output : Int
	 * Initialize a variable to hold the count
	 * Iterate through the numbers
	 * 	Add the value of i along with total (5+4+3+2+1)
	 * Return total
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(55, handshakeCount(10));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, handshakeCount(1));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(15, handshakeCount(5));
	}
	
	public int handshakeCount(int n)
	{
		if(n == 1)
		{
			return 0;
		}
		int handShakes = 0;
		for(int i=0; i<=n; i++)
		{
			handShakes = handShakes + i;
		}
		return handShakes;
	}
}
