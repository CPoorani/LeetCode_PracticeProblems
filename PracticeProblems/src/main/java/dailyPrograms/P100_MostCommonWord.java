package dailyPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class P100_MostCommonWord {
	
	/*
	 * Input : String and Array
	 * Output : String
	 * Initialize variables commonWord and max
	 * Convert the given input paragraph to lower case and split using spaces
	 * Iterate through the array and check if the banned word is present
	 * If not, add the word to the map else increase the count of the word
	 * Iterate over the map
	 * If the value of the word is greater than the maxCount
	 * Get the key and assign it to commonWord and value to max
	 * Return the commonWord
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("ball", mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("a", mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit", "ball", "the"}));
	}
	
	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
		Map<String, Integer> map = new HashMap<>();
		String[] words = paragraph.split("[!?',;.\\s]+");

		for (String word : words) {
			if (!Arrays.asList(banned).contains(word)) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}
		
		String commonWord = "";
		int max = 0;
		for(Map.Entry<String, Integer> each : map.entrySet())
		{
			if(each.getValue()>max)
			{
				commonWord = each.getKey();
				max = each.getValue();			
			}
		}

		return commonWord;

	}
}
