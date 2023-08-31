package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P54_ReverseAnInteger {

	/*
	 * Problem stmt : Reversing an integer means to reverse all its digits.
	 * 
	 * For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the
	 * leading zeros are not retained. Given an integer num, reverse num to get
	 * reversed1, then reverse reversed1 to get reversed2. Return true if reversed2
	 * equals num. Otherwise return false.
	 * 
	 * Input : Int
	 * Output : Boolean
	 * Convert the number to String
	 * Initialize a String variable rev
	 * 	Iterate through the input string in reverse
	 * 		get each character and append with rev
	 * Convert the first reversed string to int 
	 * Reset the rev 
	 * Again follow the same above steps for reversed2
	 * if reversed2 == num, return true
	 * else return false
	 */
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, reverse(143));
	}
	
	@Test
	public void test()
	{
		Assert.assertEquals(true, reverse(2021));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, reverse(12300));
	}

	public boolean reverse(int num)
	{
		String number = String.valueOf(num);
		String rev = "";
		
		 for (int i = number.length() - 1; i >= 0; i--) {
		        rev = rev + number.charAt(i);
		    }
		 
		 //for revered1 to revered2
		 int reversed1 = Integer.parseInt(rev);
		 String reversedString = String.valueOf(reversed1);
		 rev = ""; //reset to find the reversed2
		 
		 for (int i = reversedString.length() - 1; i >= 0; i--) {
		        rev = rev + reversedString.charAt(i);
		    }
		 int reversed2 = Integer.parseInt(rev);
		 
		 
		return reversed2==num;
	}

}
