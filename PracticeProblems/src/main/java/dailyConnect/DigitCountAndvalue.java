package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class DigitCountAndvalue {
	
	/*
	 * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
	 * input : String
	 * output : boolean
	 * 
	 * Create an int array with size 10
	 * Convert the string to character array
	 * Iterate through the array
	 * get the value of the each and store it in the count array
	 * iterate through the input array
	 * 	append the value of each index
	 * 	compare with input and return true or false
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals(true, digitCount("1210"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, digitCount("590023"));
	}
	
	
	 public boolean digitCount(String num)
	 {
		 int[] count = new int[10]; 

		    for (char digit : num.toCharArray()) {
		        int value = digit - '0';
		        count[value]++;
		    }

		    StringBuilder output = new StringBuilder();
		    for (int i = 0; i < num.length(); i++) {
		        output.append(count[i]);
		    }

		    return output.toString().equals(num);
		}
}