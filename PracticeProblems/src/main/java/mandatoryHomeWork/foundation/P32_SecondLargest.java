package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P32_SecondLargest {
	/*
	 * Input: String
	 * Output: Int
	 * Have three variables, first, second and temp
	 * Convert the string to character array
	 * Traverse through the Character array
	 * check it is a digit and get the numeric value 
	 * check if temp>first, if so second = first and first = temp
	 * else temp > second && temp < first then second = temp
	 * return second
	 */

	@Test
	public void test() {
		Assert.assertEquals(2, findSecondLargest("dfa12321afd"));
	}

	public int findSecondLargest(String str) {
		int first = -1;
		int second = -1;
		int temp = 0;

		for (char arr : str.toCharArray()) {
			if (Character.isDigit(arr))
				temp = Character.getNumericValue(arr);
			if (temp > first) {
				second = first;
				first = temp;
			} else if (temp > second && temp < first) {
				second = temp;
			}
		}
		return second;

	}

}
