package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class P4_NextLargestCharacter {

	/*
	 * Input : character array and the target character
	 * Output : Character
	 * Have a variable as largest, which holds the largest character value
	 * Iterate through the array
	 * if arr[i] > target && arr[i] < largest
	 * 			then assign the largest value with the current character value
	 * return largest
	 * 
	 */
	@Test
	public void test() {
		char actual = largestCharacter(new char[] { 'b', 'd', 'h', 'z' }, 'b');
		Assert.assertEquals('d', actual);
	}

	@Test
	public void test1() {
		char actual = largestCharacter(new char[] { 'b', 'e', 'w', 'z' }, 'y');
		Assert.assertEquals('z', actual);
	}

	public char largestCharacter(char[] arr, char target) {
		char largest = Character.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > target && arr[i] < largest) {
				largest = arr[i];
			}
		}

		return largest;

	}

}
