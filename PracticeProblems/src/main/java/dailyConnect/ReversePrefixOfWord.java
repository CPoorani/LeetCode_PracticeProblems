package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.testng.Assert;

public class ReversePrefixOfWord {

	/*
	 * Dataset : "abcdefd", ch = "d", "zxyxxe", ch = "z", "abcd" = "z", word = "" ch = "a"
	 * 
	 * Iterate through the given word 
	 * If the character matches in the given word, then break and do a reversal of from the character 
	 * Using substring, append the remaining characters and return
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("dcbaefd", reversePrefix("abcdefd", 'd'));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("azaaaaaz", reversePrefix("zaaaaaaz", 'a'));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("abcd", reversePrefix("abcd", 'z'));
	}

	public String reversePrefix(String word, char ch) {
		char[] toCharArr = word.toCharArray();
		String temp = "";
		int index = -1;

		for (int i = 0; i < toCharArr.length; i++) {
			temp = temp + word.charAt(i);
			if (toCharArr[i] == ch) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			return word;
		}

		String revStr = "";
		for (int j = temp.length() - 1; j >= 0; j--) {
			revStr = revStr + temp.charAt(j);
		}

		if (index >= 0) {
			revStr = revStr + word.substring(index + 1);
		}

		return revStr;
	}
}






