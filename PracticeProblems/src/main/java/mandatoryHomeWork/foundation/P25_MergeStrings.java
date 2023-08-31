package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P25_MergeStrings {
	
	/*
	 * Input : String (W1 and W2)
	 * Output : Return String
	 * Initialize two variables finding the length of each
	 * Initialize a temp variable
	 * If (l1=l2), traverse through the words1 and
	 * 		temp+word1.charAt(i)+word2.CharAt(i)
	 * if (l1>l2)
	 * Traverse through the words2 length and concatenate the alternative characters until words 2 is reached
	 * Outside the loop, concatenate the remaining characters of words1 with the substring(l2)
	 * if (l1<l2)
	 *  Traverse through the words1 length and concatenate the alternative characters until words 1 is reached
	 * Outside the loop, concatenate the remaining characters of words2 with the substring(l1)
	 */
	@Test
	public void test() {
		String actual = isMerged("abc", "pqr");
		Assert.assertEquals("apbqcr", actual);
	}

	@Test
	public void test1() {
		String actual = mergeAlternately("ab", "pqrs");
		Assert.assertEquals("apbqrs", actual);
	}
	
	@Test
	public void test2() {
		String actual = isMerged("abcd", "pq");
		Assert.assertEquals("apbqcd", actual);
	}
	

	//29-08-2023
	public String mergeAlternately(String word1, String word2) {

		int l1 = word1.length();
		int l2 = word2.length();
		int i = 0;
		int j = 0;
		StringBuilder temp = new StringBuilder();
		while (i < l1 && j < l2) {
			temp.append(word1.charAt(i)).append(word2.charAt(j));
			i++;
			j++;
		}

		temp.append(word1.substring(i)).append(word2.substring(j));

		System.out.println(temp);

		return temp.toString();
	}
	
	public String isMerged(String words1, String words2) {
		String temp = "";
		int l1 = words1.length();
		int l2 = words2.length();
		if (l1 == l2) {
			for (int i = 0; i < words1.length(); i++) {
				temp = temp + words1.charAt(i) + words2.charAt(i);
			}

		}

		else if (l1 > l2) {
			for (int i = 0; i < words2.length(); i++) {
				temp = temp + words1.charAt(i) + words2.charAt(i);
			}
			temp = temp.concat(words1.substring(l2));
		}

		else { // l1 < l2
			for (int i = 0; i < words1.length(); i++) {
				temp = temp + words1.charAt(i) + words2.charAt(i);
			}
			temp = temp.concat(words2.substring(l1));
		}
		return temp;

	}
	}
	