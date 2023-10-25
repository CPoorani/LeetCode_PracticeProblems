package dailyConnect;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class ShortestCompletingWord {
	
	/*
	 * 1s3 456 - looks, pest, stew and show
	 * Shortest is pest
	 * Create an empty map
	 * Iterate through the license plate and add the count to map
	 * Repeat the same for words as well
	 * get the word and plate count
	 * if the word count is lesser, mark the flag as false 
	 */
	@Test
	public void test()
	{
		Assert.assertEquals("steps", shortestCompletingWord("1s3 PSt", new String[] {"step","steps","stripe","stepple"}));
	}

	public String shortestCompletingWord(String licensePlate, String[] words) {
		licensePlate = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();
	    Map<Character, Integer> map = new HashMap<>();
	    String wordToFind = null;

	    for (char c : licensePlate.toCharArray()) {
	        map.put(c, map.getOrDefault(c, 0) + 1);
	    }

	    for (String word : words) {
	        Map<Character, Integer> forWords = new HashMap<>();

	        for (char ch : word.toCharArray()) {
	            forWords.put(ch, forWords.getOrDefault(ch, 0) + 1);
	        }

	        boolean flag = true;
	        for (char c : licensePlate.toCharArray()) {
	            int plateCount = map.getOrDefault(c, 0);
	            int wordCount = forWords.getOrDefault(c, 0);
	            if (wordCount < plateCount) {
	                flag = false;
	                break;
	            }
	        }

	        if (flag) {
	            if (wordToFind == null || word.length() < wordToFind.length()) {
	                wordToFind = word;
	            }
	        }
	    }

	    return wordToFind;
	}
}