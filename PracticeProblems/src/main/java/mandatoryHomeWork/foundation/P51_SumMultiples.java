package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P51_SumMultiples {
	
	/*
	 * Input : Int
	 * Output : Int
	 * Initialize a variable sum with 0
	 * Iterate through the elements of given n (1 to n)
	 * 		if(i%3 ==0) || (i%5 ==0) || (i%7 ==0)
	 * 			Add the sum along with i
	 * Return sum
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(21, isMultiple(7));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(40, isMultiple(10));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, isMultiple(0));
	}
	
	public int isMultiple(int n)
	{
		 int sum = 0;
		    for (int i = 1; i <= n; i++) { 
		        if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
		            sum += i;
		        }
		    }
		    return sum;
		}
}
