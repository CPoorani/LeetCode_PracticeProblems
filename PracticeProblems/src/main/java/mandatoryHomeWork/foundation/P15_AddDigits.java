package mandatoryHomeWork.foundation;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class P15_AddDigits {

	// https://leetcode.com/problems/add-digits/description/
	
	/*
	 * Input : Integer
	 * Output : Integer
	 * If the num>=10 ==> return num
	 * While the num>0,
	 * 		Initialize a variable sum
	 * 		sum = sum+num%10
	 * 		num = num/10
	 * Assign the value of sum to num and continue the same process until it reaches a single digit
	 * Return num
	 */
	@Test
	public void test()
	{
		int actual = addDigits(38);
		Assert.assertEquals(2, actual);
	}

	public int addDigits(int num) {
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10; 
				num /= 10;
			}
			num = sum;
		}
		return num;
	}

}
