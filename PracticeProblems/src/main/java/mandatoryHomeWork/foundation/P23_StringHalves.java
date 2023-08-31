package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P23_StringHalves {
	
	/*
	 * Input : String
	 * Output : Boolean
	 * Using substring method, split the string into two halves
	 * Initialize two variables count and temp
	 * Initialize vowels to "AEIOUaeiou"
	 * Have two loops, one to iterate the vowels and other to iterate the characters in the String
	 * Repeat the same for the first and second String
	 * Return count=temp
	 */

	@Test
	public void test() {
		boolean actual = isAlike("book");
		Assert.assertEquals(true, actual);
	}

	@Test
	public void test1() {
		boolean actual = isAlike("textbook");
		Assert.assertEquals(false, actual);
	}

	public boolean isAlike(String input) {
		String a = input.substring(0, input.length() / 2);
		String b = input.substring(input.length() / 2, input.length());
		String vowels = "AEIOUaeiou";
		int count = 0;
		int temp = 0;

		for (int i = 0; i < vowels.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (vowels.indexOf(a.charAt(j)) != -1) {
					count++;
				}
			}
		}
		

		for (int i = 0; i < vowels.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (vowels.indexOf(b.charAt(j)) != -1) {
					temp++;
				}
			}
		}

		return count == temp;

	}

}
