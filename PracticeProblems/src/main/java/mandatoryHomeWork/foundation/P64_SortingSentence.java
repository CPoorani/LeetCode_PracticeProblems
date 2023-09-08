package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P64_SortingSentence {
	
	/*
	 * Input : String
	 * Output : String
	 * Split the words based on space and initialize an array to hold the sorted words
	 * Iterate through the array
	 * 	Assign each of the word to str
	 * 	Get the numeric value of each word for index
	 * 	Get the substring by removing the number (0, str.length() -1)
	 * 	Add it in the sorted array
	 * Traverse through the sorted array
	 * Append each word along with space
	 * Return the String object
	 */

	@Test
	public void test() {
		Assert.assertEquals("This is a sentence", sortSentence("is2 sentence4 This1 a3"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("Me Myself and I Myself Me Myself I Me", sortSentence("Myself2 Me1 I4 and3 Myself7 Me6 I8 Myself5 Me9"));
	}

	public String sortSentence(String s) {
		String[] split = s.split(" ");
		String[] sorted = new String[split.length];

		for (int i = 0; i < split.length; i++) {
			String str = split[i];
			int index = Character.getNumericValue(str.charAt(str.length() - 1)) - 1;
			sorted[index] = str.substring(0, str.length() - 1);
		}

		StringBuilder output = new StringBuilder();
		for (String words : sorted) {
			output.append(words).append(" ");
		}
		return output.toString().trim();
	}
}
