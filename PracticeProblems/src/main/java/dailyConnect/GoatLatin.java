package dailyConnect;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

/*
 * case 1 : start index : vowel
 * case 2 : start index : consonant
 * case 3 : Add a according to the index
 * Create a string builder
 * Iterate through the words
 * create a variable vowel
 * Take the substring from 0 to 1, append it with ma
 * else get the first character and move it to last and append
 * For each of the iteration append the a
 */

public class GoatLatin {
	@Test
	public void test()
	{
		Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin("I speak Goat Latin"));
	}

	public String toGoatLatin(String sentence) {

		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		String vowel = "aeiouAEIOU";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			if (vowel.contains(word.substring(0, 1))) {
				result.append(word).append("ma");
			} else {
				result.append(word.substring(1)).append(word.charAt(0)).append("ma");
			}

			for (int j = 0; j <= i; j++) {
				result.append("a");
			}

			if (i < words.length - 1) {
				result.append(" ");
			}
		}

		return result.toString();
	}
}
